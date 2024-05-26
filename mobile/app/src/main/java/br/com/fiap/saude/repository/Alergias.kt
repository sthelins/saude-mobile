package br.com.fiap.saude.repository

import br.com.fiap.saude.model.Alergia

fun getAllAlergias(): List<Alergia> {
    return listOf(
        Alergia(id_alergia = 1, descricao = "Dipirona", verificado = "S", id_anexo = 1),
        Alergia(id_alergia = 2, descricao = "Amendoim", verificado = "S", id_anexo = 2),
        Alergia(id_alergia = 3, descricao = "Picadad de Abelha", verificado = "N", id_anexo = 0),
        Alergia(id_alergia = 4, descricao = "Morango", verificado = "N", id_anexo = 0),
        Alergia(id_alergia = 5, descricao = "MorfinA", verificado = "N", id_anexo = 0)
    )
}

//fun getAlergiaByStudio(studio: String): List<Alergia>{
//    return getAllGames().filter {
//        it.Alergia.startsWith(prefix = studio, ignoreCase = true)
 //   }
//}