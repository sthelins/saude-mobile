package br.com.fiap.saude.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.saude.components.CardDefault
import br.com.fiap.saude.components.NavBar
import br.com.fiap.saude.model.Vacina
import br.com.fiap.saude.repository.getAllAlergias
import br.com.fiap.saude.repository.getAllVacinas
import java.time.format.DateTimeFormatter

@Composable
fun MainScreen(navController: NavController) {
    Column() {
        NavBar(navController)
        Spacer(modifier = Modifier.height(20.dp))
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFD3D3D3))
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "ALERGIAS", color = Color.Black, fontWeight = FontWeight.Bold)
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
                .background(Color(0xFFD3D3D3))
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "ALERGIAS API", color = Color.Black, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "NENHUMA ALEGIA ENCONTRADA",modifier = Modifier.padding(start = 10.dp))
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFD3D3D3))
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "VACINAS", color = Color.Black, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(10.dp))
            VacinaTable(getAllVacinas())
        }
    }
}

@Composable
fun VacinaTable(vacinas: List<Vacina>) {
    val dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    Column(modifier = Modifier.padding(10.dp)) {
        // Table Header
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically) {
            TableHeaderCell(text = "Descrição")
            TableHeaderCell(text = "Data Vacina")
            TableHeaderCell(text = "Dose")
            TableHeaderCell(text = "Ação")
        }

        // Table Content
        LazyColumn {
            items(vacinas) { vacina ->
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(vertical = 4.dp)) {
                    ReportVacinas(
                        descricao = vacina.ds_vacina,
                        data = vacina.data_vacina.format(dateFormatter),
                        dose = vacina.dose
                    )
                }
            }
        }
    }
}

@Composable
fun TableHeaderCell(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .padding(start = 1.dp, top = 2.dp, end = 1.dp, bottom = 2.dp),
        fontWeight = FontWeight.Bold,
        color = Color.White,
        //style = MaterialTheme.typography.body1
    )
}

@Composable
fun ReportVacinas(descricao: String, data: String, dose: String) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically) {
        Text(text = descricao)
        Text(text = data)
        Text(text = dose)
        Text(text = "i")
    }
}

//LazyColumn(){
//    items(getAllVacinas()){
//        Column() {
//            Text(text = it.ds_vacina)
//        }
//    }
//}