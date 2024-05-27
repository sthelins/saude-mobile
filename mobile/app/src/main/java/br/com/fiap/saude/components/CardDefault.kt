package br.com.fiap.saude.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.fiap.saude.R
import br.com.fiap.saude.model.Alergia

@Composable
fun CardDefault(alergia: Alergia) {
    Card(modifier = Modifier
        .size(130.dp)
        .padding(start = 2.dp, end = 2.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
                .padding(end = 1.dp)) {
            if (alergia.verificado == "S"){
                //verificado
                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .background(Color(0xFF4CAF50).copy(alpha = 0.5f))
                        .fillMaxWidth()
                        .padding(1.5.dp)
                        .height(50.dp)) {
                    Icon(painter = painterResource(id = R.drawable.check_branco), contentDescription = "Ícone de alergia verificada")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Verificado")
                }
            } else {
                //Não verificado
                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .background(Color(0xFFD3102D).copy(alpha = 0.5f))
                        .fillMaxWidth()
                        .padding(1.5.dp)) {
                    Icon(painter = painterResource(id = R.drawable.warning_branco), contentDescription = "Ícone de alergia não verificada")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Não verificado")
                }
            }
        }
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()) {
            Text(text = alergia.descricao)
        }
    }
}