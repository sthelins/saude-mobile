package br.com.fiap.saude.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.saude.R
import br.com.fiap.saude.ui.theme.SaudeTheme

@Composable
fun NavBar(navController: NavController) {

    var expanded by remember {
        mutableStateOf(false)
    }
    if (!expanded) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color(0xFF6739B7)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { expanded = !expanded },
            colors = ButtonDefaults.buttonColors(Color.Transparent,
                contentColor = Color.White
            )
        ) {
            Icon(painter = painterResource(id = R.drawable.menu_branco), contentDescription = "Ícone de menu")
        }
        Button(
            onClick = { navController.navigate("dadospessoais") },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .size(56.dp)) // Define o tamanho do botão
                    {
            Icon(painter = painterResource(id = R.drawable.person), contentDescription = "Ícone de pessoa")
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
            Button(onClick = { navController.navigate("main") }) {
                Text(text = "HOME",
                    color = Color.White)
            }
            Button(onClick = { navController.navigate("dadospessoais") }) {
                Text(text = "DADOS PESSOAL",
                    color = Color.White)
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "CONFIGURAÇÕES",
                    color = Color.White)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SaudeTheme {
        //NavBar()
    }
}