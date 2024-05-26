package br.com.fiap.saude.model

data class Alergia(
    val id_alergia: Long = 0,
    val descricao: String = "",
    val verificado: String = "",
    val id_anexo: Long = 0
)
