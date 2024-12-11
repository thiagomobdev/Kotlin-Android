import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(onCadastrarClick: () -> Unit, onPesquisarClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Button(onClick = onCadastrarClick, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Cadastrar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onPesquisarClick, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Pesquisar")
        }
    }
}
