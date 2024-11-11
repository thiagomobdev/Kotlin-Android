// Tipos para o sistema
interface TaskDescription {
    content: string;
    format: 'md' | 'html';
    hints: Hint[];
    shortcuts: Shortcut[];
    links: Link[];
    macros: Macro[];
}

interface Hint {
    id: string;
    content: string;
    position: number;
}

interface Shortcut {
    id: string;
    key: string;
    description: string;
}

interface Link {
    type: 'course' | 'psi' | 'file';
    text: string;
    path: string;
}

interface Macro {
    name: string;
    value: string;
}

// Classe principal para gerenciar descrições de tarefas
class TaskDescriptionManager {
    private currentFormat: 'md' | 'html' = 'md';
    private taskDescription: TaskDescription;

    constructor() {
        this.taskDescription = {
            content: '',
            format: 'md',
            hints: [],
            shortcuts: [],
            links: [],
            macros: []
        };
    }

    // Definir conteúdo da tarefa
    setContent(content: string): void {
        this.taskDescription.content = content;
    }

    // Alternar formato (md/html)
    toggleFormat(): void {
        this.currentFormat = this.currentFormat === 'md' ? 'html' : 'md';
        this.taskDescription.format = this.currentFormat;
    }

    // Adicionar uma dica
    addHint(content: string, position: number): void {
        const hint: Hint = {
                id: `hint-${Date.now()}`,
                content,
                position
        };
        this.taskDescription.hints.push(hint);
    }

    // Adicionar um atalho
    addShortcut(key: string, description: string): void {
        const shortcut: Shortcut = {
                id: `shortcut-${Date.now()}`,
                key,
                description
        };
        this.taskDescription.shortcuts.push(shortcut);
    }

    // Adicionar um link
    addLink(type: 'course' | 'psi' | 'file', text: string, path: string): void {
        const link: Link = {
                type,
                text,
                path
        };
        this.taskDescription.links.push(link);
    }

    // Adicionar uma macro
    addMacro(name: string, value: string): void {
        const macro: Macro = {
                name,
                value
        };
        this.taskDescription.macros.push(macro);
    }

    // Renderizar o conteúdo
    renderContent(): string {
        let renderedContent = this.taskDescription.content;

        // Processar hints
        this.taskDescription.hints.forEach(hint => {
            const hintHtml = `<div class="hint">\n${hint.content}\n</div>`;
            renderedContent = this.insertAtPosition(renderedContent, hintHtml, hint.position);
        });

        // Processar links
        this.taskDescription.links.forEach(link => {
            let linkFormat = '';
            switch (link.type) {
                case 'course':
                linkFormat = `[${link.text}](course://${link.path})`;
                break;
                case 'psi':
                linkFormat = `[${link.text}](psi_element://${link.path})`;
                break;
                case 'file':
                linkFormat = `[${link.text}](file://${link.path})`;
                break;
            }
            renderedContent = renderedContent.replace(`{{link:${link.text}}}`, linkFormat);
        });

        // Processar macros
        this.taskDescription.macros.forEach(macro => {
            renderedContent = renderedContent.replace(
                new RegExp(`%${macro.name}%`, 'g'),
            macro.value
            );
        });

        // Processar atalhos
        this.taskDescription.shortcuts.forEach(shortcut => {
            renderedContent = renderedContent.replace(
                `{{shortcut:${shortcut.id}}}`,
                `&shortcut:${shortcut.key};`
            );
        });

        return renderedContent;
    }

    // Utilitário para inserir texto em uma posição específica
    private insertAtPosition(text: string, insertion: string, position: number): string {
        return text.slice(0, position) + insertion + text.slice(position);
    }

    // Salvar descrição da tarefa
    saveTaskDescription(filePath: string): boolean {
        try {
            // Aqui você implementaria a lógica real de salvamento em arquivo
            const content = this.renderContent();
            console.log(`Salvando em ${filePath}:\n${content}`);
            return true;
        } catch (error) {
            console.error('Erro ao salvar descrição da tarefa:', error);
            return false;
        }
    }
}

// Exemplo de uso
class TaskDescriptionExample {
    static run(): void {
        const manager = new TaskDescriptionManager();

        // Definir conteúdo básico
        manager.setContent(`# Exemplo de Tarefa
        Este é um exemplo de descrição de tarefa.
        {{hint:1}}
        Você pode adicionar links como este: {{link:documentação}}
        A IDE atual é %IDE_NAME%
        `);

        // Adicionar uma dica
        manager.addHint('Esta é uma dica importante!', 50);

        // Adicionar um link
        manager.addLink('course', 'documentação', 'lesson1/docs');

        // Adicionar uma macro
        manager.addMacro('IDE_NAME', 'IntelliJ IDEA');

        // Adicionar um atalho
        manager.addShortcut('FileStructurePopup', 'Ctrl+F12');

        // Renderizar e salvar
        console.log(manager.renderContent());
        manager.saveTaskDescription('task.md');
    }
}

// Executar exemplo
TaskDescriptionExample.run();