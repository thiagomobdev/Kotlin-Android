import androidx.compose.ui.window.application
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.rememberWindowState
// Modelo de Dados
data class Cliente(
    val id: Long = System.currentTimeMillis(),
    val nomeCompleto: String,
    val cpf: String,
    val dataNascimento: String,
    val endereco: String,
    val telefone: String,
    val alfabetizado: Boolean
)

// Repositório para gerenciar clientes (simulando um banco de dados)
class ClienteRepository {
    private val clientes = mutableStateListOf<Cliente>()

    fun adicionarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun buscarClientes(termoPesquisa: String): List<Cliente> {
        return clientes.filter { cliente ->
            cliente.nomeCompleto.contains(termoPesquisa, ignoreCase = true) ||
                    cliente.cpf.contains(termoPesquisa)
        }
    }

    fun obterTodosClientes() = clientes.toList()
}

// ViewModel para gerenciar o estado e a lógica
class ClienteViewModel {
    private val _repository = ClienteRepository()
    val clientes = mutableStateListOf<Cliente>()

    fun salvarCliente(
        nomeCompleto: String,
        cpf: String,
        dataNascimento: String,
        endereco: String,
        telefone: String,
        alfabetizado: Boolean
    ) {
        val novoCliente = Cliente(
            nomeCompleto = nomeCompleto,
            cpf = cpf,
            dataNascimento = dataNascimento,
            endereco = endereco,
            telefone = telefone,
            alfabetizado = alfabetizado
        )
        _repository.adicionarCliente(novoCliente)
        clientes.add(novoCliente)
    }

    fun pesquisarClientes(termo: String) {
        clientes.clear()
        clientes.addAll(_repository.buscarClientes(termo))
    }
}

// Tela principal do aplicativo
@Composable
fun AppCadastroClientes() {
    val viewModel = remember { ClienteViewModel() }
    var mostrarFormulario by remember { mutableStateOf(false) }
    var termoPesquisa by remember { mutableStateOf("") }

    // Controladores para os campos do formulário
    var nomeCompleto by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }
    var dataNascimento by remember { mutableStateOf("") }
    var endereco by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var alfabetizado by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        // Barra de menu
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { mostrarFormulario = true }) {
                Text("Cadastro")
            }
        }

        // Campo de pesquisa
        TextField(
            value = termoPesquisa,
            onValueChange = {
                termoPesquisa = it
                viewModel.pesquisarClientes(it)
            },
            label = { Text("Pesquisar Cliente") },
            modifier = Modifier.fillMaxWidth()
        )

        // Formulário de Cadastro (Modal)
        if (mostrarFormulario) {
            AlertDialog(
                onDismissRequest = { mostrarFormulario = false },
                title = { Text("Cadastro de Cliente") },
                text = {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        TextField(
                            value = nomeCompleto,
                            onValueChange = { nomeCompleto = it },
                            label = { Text("Nome Completo") }
                        )
                        TextField(
                            value = cpf,
                            onValueChange = { cpf = it },
                            label = { Text("CPF") }
                        )
                        TextField(
                            value = dataNascimento,
                            onValueChange = { dataNascimento = it },
                            label = { Text("Data de Nascimento") }
                        )
                        TextField(
                            value = endereco,
                            onValueChange = { endereco = it },
                            label = { Text("Endereço") }
                        )
                        TextField(
                            value = telefone,
                            onValueChange = { telefone = it },
                            label = { Text("Telefone") }
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(
                                checked = alfabetizado,
                                onCheckedChange = { alfabetizado = it }
                            )
                            Text("Alfabetizado?")
                        }
                    }
                },
                confirmButton = {
                    Button(
                        onClick = {
                            viewModel.salvarCliente(
                                nomeCompleto,
                                cpf,
                                dataNascimento,
                                endereco,
                                telefone,
                                alfabetizado
                            )
                            // Limpar campos após salvar
                            nomeCompleto = ""
                            cpf = ""
                            dataNascimento = ""
                            endereco = ""
                            telefone = ""
                            alfabetizado = false
                            mostrarFormulario = false
                        }
                    ) {
                        Text("Salvar")
                    }
                },
                dismissButton = {
                    Button(onClick = { mostrarFormulario = false }) {
                        Text("Cancelar")
                    }
                }
            )
        }

        // Lista de Clientes
        LazyColumn {
            items(viewModel.clientes) { cliente ->
                Card(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Nome: ${cliente.nomeCompleto}")
                        Text("CPF: ${cliente.cpf}")
                        Text("Data Nascimento: ${cliente.dataNascimento}")
                        Text("Endereço: ${cliente.endereco}")
                        Text("Telefone: ${cliente.telefone}")
                        Text("Alfabetizado: ${if (cliente.alfabetizado) "Sim" else "Não"}")
                    }
                }
            }
        }
    }
}

// Função principal do aplicativo
@Composable
fun MainApp() {
    MaterialTheme {
        AppCadastroClientes()
    }
}