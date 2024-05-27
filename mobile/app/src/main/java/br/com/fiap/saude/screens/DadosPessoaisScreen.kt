package br.com.fiap.saude.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.saude.components.NavBar

@Composable
fun DadosPessoaisScreen(navController: NavController) {
    Column() {
        NavBar(navController)
        Column {
            Text(text = "Página de dados pessoais")
            Row() {
                Text(text = "nome da pessoa")
                Text(text = "imagem da pessoa")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF9C27B0))
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "RESIDÊNCIA")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "INFORMAÇÕES RESIDÊNCIA")
            Spacer(modifier = Modifier.height(20.dp))

            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF9C27B0))
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "CONTATOS DE EMERGÊNCIA")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "CONTATOS DE EMERGÊNCIA")
            Spacer(modifier = Modifier.height(20.dp))

            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF9C27B0))
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "PLANO MÉDICO")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "INFORMAÇÕES PLANO MÉDICO")
        }

    }
}