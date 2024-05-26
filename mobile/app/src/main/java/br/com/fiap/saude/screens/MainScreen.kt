package br.com.fiap.saude.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.saude.ui.theme.SaudeTheme

@Composable
fun MainScreen() {
    Column() {
        Text(text = "Tela main")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SaudeTheme {
        MainScreen()
    }
}
