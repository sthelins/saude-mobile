package br.com.fiap.saude.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.saude.components.CardDefault
import br.com.fiap.saude.components.NavBar
import br.com.fiap.saude.repository.getAllAlergias

@Composable
fun MainScreen(navController: NavController) {
    Column() {
        NavBar(navController)
        Spacer(modifier = Modifier.height(20.dp))
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF9C27B0))
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "ALERGIAS")
            }
            Spacer(modifier = Modifier.height(10.dp))
            LazyRow(){
                items(getAllAlergias()) {
                    CardDefault(alergia = it)
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF9C27B0))
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "VACINAS")
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "NENHUMA VACINA ENCONTRADA")
        }
        //LazyColumn(){
        //    items(getAllAlergias()){
        //        Column() {
        //            Text(text = it.descricao)
        //        }
        //    }
        //}
    }
}