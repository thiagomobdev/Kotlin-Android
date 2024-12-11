import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

private val ModernColors = lightColors(
    primary = Color(0xFF3F51B5),
    primaryVariant = Color(0xFF303F9F),
    secondary = Color(0xFFFFC107),
    background = Color(0xFFF5F5F5),
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

@Composable
fun App() {
    var currentScreen by remember { mutableStateOf("menu") }
    var clienteData by remember { mutableStateOf(Cliente()) }
    var clientes by remember { mutableStateOf(mutableListOf<Cliente>()) }

    MaterialTheme(colors = ModernColors) {
        when (currentScreen) {
            "menu" -> ModernMainScreen(
                onCadastrarClick = { currentScreen = "cadastro" },
                onPesquisarClick = { currentScreen = "pesquisa" }
            )
            "cadastro" -> CadastroScreen(
                cliente = clienteData,
                onSave = { cliente ->
                    if (!clientes.contains(cliente)) {
                        clientes.add(cliente.copy(id = (clientes.maxOfOrNull { it.id } ?: 0) + 1))
                    } else {
                        val index = clientes.indexOfFirst { it.id == cliente.id }
                        if (index != -1) clientes[index] = cliente
                    }
                    clienteData = Cliente()
                    currentScreen = "menu"
                },
                onCancel = { currentScreen = "menu" }
            )
            "pesquisa" -> PesquisaScreen(
                clientes = clientes,
                onEdit = { cliente ->
                    clienteData = cliente
                    currentScreen = "cadastro"
                },
                onDelete = { cliente -> clientes.remove(cliente) },
                onBack = { currentScreen = "menu" }
            )
        }
    }
}

@Composable
fun ModernMainScreen(onCadastrarClick: () -> Unit, onPesquisarClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color(0xFFBBDEFB), Color(0xFF3F51B5))
                )
            )
            .padding(16.dp)
    ) {
        Text(
            text = "BOMSUCESSO CONSIGNADO",
            fontSize = 32.sp,
            color = Color.White,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ModernButton("Cadastrar", onCadastrarClick)
            ModernButton("Pesquisar", onPesquisarClick)
        }
    }
}

@Composable
fun CadastroScreen(cliente: Cliente, onSave: (Cliente) -> Unit, onCancel: () -> Unit) {
    var nome by remember { mutableStateOf(cliente.nome) }
    var cpf by remember { mutableStateOf(cliente.cpf) }
    var telefone by remember { mutableStateOf(cliente.telefone) }
    var endereco by remember { mutableStateOf(cliente.endereco) }
    var alfabetizado by remember { mutableStateOf(cliente.alfabetizado) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Formulário de Cadastro", fontSize = 20.sp, color = MaterialTheme.colors.primary)

        InputField(value = nome, label = "Nome Completo") { nome = it }
        InputField(value = cpf, label = "CPF", keyboardType = KeyboardType.Number) { cpf = it }
        InputField(value = telefone, label = "Número de Telefone", keyboardType = KeyboardType.Phone) { telefone = it }
        InputField(value = endereco, label = "Endereço") { endereco = it }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Alfabetizado?", fontSize = 16.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Checkbox(checked = alfabetizado, onCheckedChange = { alfabetizado = it })
        }

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            ModernButton("Salvar", onClick = {
                onSave(Cliente(nome, cpf, telefone, endereco, alfabetizado, cliente.id))
            })
            ModernButton("Cancelar", onClick = onCancel)
        }
    }
}

@Composable
fun PesquisaScreen(
    clientes: List<Cliente>,
    onEdit: (Cliente) -> Unit,
    onDelete: (Cliente) -> Unit,
    onBack: () -> Unit
) {
    var query by remember { mutableStateOf("") }
    val filteredClientes = clientes.filter {
        it.nome.contains(query, ignoreCase = true) || it.cpf.contains(query)
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Pesquisar") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(filteredClientes) { cliente ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text("Nome: ${cliente.nome}")
                        Text("CPF: ${cliente.cpf}")
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        ModernButton("Editar") { onEdit(cliente) }
                        ModernButton("Excluir") { onDelete(cliente) }
                    }
                }
                Divider()
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        ModernButton("Voltar", onClick = onBack)
    }
}

@Composable
fun InputField(
    value: String,
    label: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = keyboardType, imeAction = ImeAction.Next),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun ModernButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .wrapContentSize()
            .padding(4.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
        shape = CircleShape
    ) {
        Text(text, color = Color.White, fontSize = 14.sp)
    }
}

data class Cliente(
    val nome: String = "",
    val cpf: String = "",
    val telefone: String = "",
    val endereco: String = "",
    val alfabetizado: Boolean = false,
    val id: Int = -1
)

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Cadastro de Clientes") {
        App()
    }
}
