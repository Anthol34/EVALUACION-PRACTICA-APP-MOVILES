package com.example.evaluacionpractica.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.ui.graphics.vector.ImageVector

data class LightNovel(
    val id: Int,
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int,
    val calificacion: Double,
    val sinopsis: String,
    val icono: ImageVector = Icons.Default.Book
)

val listaLightNovel = listOf(
    LightNovel(
        id = 1,
        titulo = "Violet Evergarden",
        autor = "Kana Akatsuki",
        anioPublicacion = 2015,
        calificacion = 4.9,
        sinopsis = "Tras el fin de la guerra, Violet Evergarden, una ex-soldado con prótesis mecánicas, busca comprender el significado de las palabras \"te amo\" trabajando como una Auto Memories Doll escribiendo cartas que expresan los sentimientos de otros.",
        icono = Icons.Default.MenuBook
    ),
    LightNovel(
        id = 2,
        titulo = "Mushoku Tensei",
        autor = "Rifujin na Magonote",
        anioPublicacion = 2014,
        calificacion = 4.8,
        sinopsis = "Un hombre desempleado de 34 años muere atropellado por un camión y renace en un mundo de fantasía e historia medieval como Rudeus Greyrat, decidido a vivir su nueva vida al máximo sin arrepentimientos.",
        icono = Icons.Default.AutoStories
    ),
    LightNovel(
        id = 3,
        titulo = "Seishun Buta",
        autor = "Hajime Kamoshida",
        anioPublicacion = 2014,
        calificacion = 4.8,
        sinopsis = "Sakuta Azusagawa presencia a su senpai, la famosa actriz Mai Sakurajima, caminando por la biblioteca vestida de conejita sin que nadie más la note, comenzando a investigar el misterioso \"Síndrome de la Pubertad\".",
        icono = Icons.Default.Bookmark
    ),
    LightNovel(
        id = 4,
        titulo = "Suzumiya Haruhi",
        autor = "Nagaru Tanigawa",
        anioPublicacion = 2003,
        calificacion = 4.7,
        sinopsis = "Kyon, un estudiante de secundaria normal, conoce a Haruhi Suzumiya, una chica obsesionada con encontrar extraterrestres, viajeros del tiempo y esperes, creando la Brigada SOS sin saber que ella posee el poder de alterar la realidad.",
        icono = Icons.Default.Book
    ),
    LightNovel(
        id = 5,
        titulo = "Hyouka",
        autor = "Honobu Yonezawa",
        anioPublicacion = 2001,
        calificacion = 4.7,
        sinopsis = "Houtarou Oreki es un estudiante de secundaria con la filosofía de ahorrar energía mental. Sin embargo, al unirse al Club de Literatura Clásica conoce a Eru Chitanda y juntos comienzan a resolver curiosos misterios cotidianos.",
        icono = Icons.Default.MenuBook
    ),
    LightNovel(
        id = 6,
        titulo = "Another Monster",
        autor = "Naoki Urasawa",
        anioPublicacion = 2002,
        calificacion = 4.6,
        sinopsis = "Un periodista investigativo viaja a Europa para recabar testimonios y documentos sobre los oscuros crímenes de Johan Liebert y el experimento del Kinderheim 511, profundizando en los misterios de la historia.",
        icono = Icons.Default.AutoStories
    )
)