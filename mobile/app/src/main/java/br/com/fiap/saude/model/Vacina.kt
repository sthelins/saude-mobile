package br.com.fiap.saude.model

import java.time.LocalDate

data class Vacina(
    val id_vacina: Long = 0,
    val ds_vacina: String = "",
    val data_vacina: LocalDate = LocalDate.now(),
    val data_cadastro: LocalDate = LocalDate.now(),
    val dose: String = "",
    val obs: String = ""
)
