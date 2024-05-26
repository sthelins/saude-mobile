package br.com.fiap.saude.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.saude.R
import br.com.fiap.saude.ui.theme.SaudeTheme

@Composable
fun NavBar() {

    var expanded by remember {
        mutableStateOf(false)
    }
    if (!expanded) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color(0xFF6739B7)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = { expanded = !expanded },
            colors = ButtonDefaults.buttonColors(Color.Transparent,
                contentColor = Color.White
            )
        ) {
            Icon(painter = painterResource(id = R.drawable.menu_branco), contentDescription = "Ícone de menu")
        }
        }
    } else {
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .background(Color(0xFF6739B7)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = { expanded = !expanded },
                colors = ButtonDefaults.buttonColors(Color.Transparent,
                    contentColor = Color.White
                )
            ) {
                Icon(painter = painterResource(id = R.drawable.close_branco), contentDescription = "Ícone de menu")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "GERAL",
                    color = Color.White)
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "PESSOAL",
                    color = Color.White)
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "NÃO SEI",
                    color = Color.White)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SaudeTheme {
        NavBar()
    }
}