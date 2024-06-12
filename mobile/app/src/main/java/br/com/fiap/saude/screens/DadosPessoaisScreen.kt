package br.com.fiap.saude.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.saude.components.NavBar
import br.com.fiap.saude.model.Endereco
import br.com.fiap.saude.serviceViaCep.RetrofitFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
            EnderecoService()

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
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnderecoService() {
    var enderecoState by remember { mutableStateOf<Endereco?>(null) }

    val cep = "01001000"

    // Chamada para obter endereço por CEP
    LaunchedEffect(cep) {
        val call = RetrofitFactory().getEnderecoService().getEndereco(cep)
        call.enqueue(object : Callback<Endereco> {
            override fun onResponse(call: Call<Endereco>, response: Response<Endereco>) {
                if (response.isSuccessful) {
                    response.body()?.let { endereco ->
                        enderecoState = endereco
                    }
                }
            }

            override fun onFailure(call: Call<Endereco>, t: Throwable) {
                println("Erro: ${t.message}")
            }
        })
    }

    Spacer(modifier = Modifier.height(8.dp))
    enderecoState?.let { endereco ->
        LazyColumn {
            items(listOf(endereco)) { item ->
                CardEndereco(item)
            }
        }
    }
}

@Composable
fun CardEndereco(endereco: Endereco) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 4.dp)) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        ) {
            Text(text = "CEP: ${endereco.cep}")
            Text(text = "Rua: ${endereco.rua}")
            Text(text = "Cidade: ${endereco.cidade}")
            Text(text = "Bairro: ${endereco.bairro}")
            Text(text = "UF: ${endereco.uf}")
        }
    }
}
