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
        titulo = "Sapiens: De animales a dioses",
        autor = "Yuval Noah Harari",
        anioPublicacion = 2011,
        calificacion = 4.8,
        sinopsis = "Una breve historia de la humanidad desde la evolución de las especies humanas en la edad de piedra hasta el siglo XXI.",
        icono = Icons.Default.MenuBook
    ),
    LightNovel(
        id = 2,
        titulo = "Cien años de soledad",
        autor = "Gabriel García Márquez",
        anioPublicacion = 1967,
        calificacion = 4.9,
        sinopsis = "La crónica de la familia Buendía en el pueblo mítico e imaginario de Macondo a lo largo de siete generaciones.",
        icono = Icons.Default.AutoStories
    ),
    LightNovel(
        id = 3,
        titulo = "El Principito",
        autor = "Antoine de Saint-Exupéry",
        anioPublicacion = 1943,
        calificacion = 4.7,
        sinopsis = "Un piloto perdido en el desierto conoce a un pequeño príncipe que viaja desde su asteroide.",
        icono = Icons.Default.Bookmark
    ),
    LightNovel(
        id = 4,
        titulo = "1984",
        autor = "George Orwell",
        anioPublicacion = 1949,
        calificacion = 4.6,
        sinopsis = "Novela distópica sobre la vigilancia masiva, el totalitarismo y el control del pensamiento impuesto por el Gran Hermano.",
        icono = Icons.Default.Book
    ),
    LightNovel(
        id = 5,
        titulo = "Hábitos Atómicos",
        autor = "James Clear",
        anioPublicacion = 2018,
        calificacion = 4.8,
        sinopsis = "Una guía práctica para crear buenos hábitos, romper los malos y dominar las pequeñas conductas que conducen a resultados notables.",
        icono = Icons.Default.MenuBook
    ),
    LightNovel(
        id = 6,
        titulo = "Don Quijote de la Mancha",
        autor = "Miguel de Cervantes",
        anioPublicacion = 1605,
        calificacion = 4.5,
        sinopsis = "Las aventuras cómicas y trágicas de un hidalgo enloquecido por los libros de caballerías.",
        icono = Icons.Default.AutoStories
    )
)