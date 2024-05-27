package br.com.fiap.saude.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.saude.R
import br.com.fiap.saude.components.CardDefault
import br.com.fiap.saude.components.NavBar
import br.com.fiap.saude.model.Alergia
import br.com.fiap.saude.repository.getAllAlergias
import br.com.fiap.saude.ui.theme.SaudeTheme

@Composable
fun MainScreen() {
    Column() {
        NavBar()
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