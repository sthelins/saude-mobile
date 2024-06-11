package br.com.fiap.saude.repository

import br.com.fiap.saude.model.Vacina
import java.time.LocalDate

fun getAllVacinas(): List<Vacina> {
    return listOf(
        Vacina(
            id_vacina = 1,
            ds_vacina = "BCG",
            data_vacina = LocalDate.of(1990, 5, 20),
            data_cadastro = LocalDate.now(),
            dose = "Única",
            obs = "obs teste"
        ),
        Vacina(
            id_vacina = 2,
            ds_vacina = "Hepatite B",
            data_vacina = LocalDate.of(1990, 5, 20),
            data_cadastro = LocalDate.now(),
            dose = "1ª dose",
            obs = ""
        ),
        Vacina(
            id_vacina = 3,
            ds_vacina = "Hepatite B",
            data_vacina = LocalDate.of(1990, 6, 20),
            data_cadastro = LocalDate.now(),
            dose = "2ª dose",
            obs = "obs teste"
        ),
        Vacina(
            id_vacina = 4,
            ds_vacina = "Pentavalente (DTP/Hib/Hepatite B)",
            data_vacina = LocalDate.of(1990, 9, 20),
            data_cadastro = LocalDate.now(),
            dose = "",
            obs = ""
        ),
        Vacina(
            id_vacina = 5,
            ds_vacina = "Varicela",
            data_vacina = LocalDate.of(1996, 5, 20),
            data_cadastro = LocalDate.now(),
            dose = "Única",
            obs = "obs teste"
        )
    )
}

//fun getAlergiaByStudio(studio: String): List<Alergia>{
//    return getAllGames().filter {
//        it.Alergia.startsWith(prefix = studio, ignoreCase = true)
 //   }
//}