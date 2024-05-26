package br.com.fiap.saude.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController) {

    Column(modifier = Modifier.background(Color(0xFF6739B7))) {
        
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            ) {
            Text(text = "SAÚDE+",
                color = Color(0xFFFFFFFF),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Column(
            modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF6739B7),
                            Color(0xFF7F60C1),
                            Color(0xFFFFFFFF)
                        )
                    )
                )
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
            ) {
                Text(text = "Bem Vindo!",
                    color = Color(0xFFFFFFFF),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Spacer(modifier = Modifier.height(80.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {navController.navigate("main") },
                       modifier = Modifier.width(250.dp),
                       colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF), contentColor = Color(0xFF6739B7))
                ) {
                    Text(text = "BENEFICIÁRIO",
                        fontSize = 20.sp)
                }
                Button(onClick = { },
                    modifier = Modifier.width(250.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF), contentColor = Color(0xFF6739B7))
                ) {
                    Text(text = "MÉDICO",
                        fontSize = 20.sp)
                }
                Button(onClick = { },
                    modifier = Modifier.width(250.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF), contentColor = Color(0xFF6739B7))
                ) {
                    Text(text = "GESTOR DA EMPRESA",
                        fontSize = 20.sp)
                }
            }

            }

        }

    }
