package com.example.evaluacionpractica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.evaluacionpractica.data.LightNovel
import com.example.evaluacionpractica.data.listaLightNovel
import com.example.evaluacionpractica.ui.theme.EVALUACIONPRACTICATheme

enum class PantallaLightNovel {
    HOME,
    CATALOGO,
    DETALLE
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EVALUACIONPRACTICATheme {
                LightNovelApp()
            }
        }
    }
}

@Composable
fun LightNovelApp() {
    var pantallaActual by remember { mutableStateOf(PantallaLightNovel.HOME) }

    var lightNovelSeleccionado by remember { mutableStateOf<LightNovel?>(null) }

    when (pantallaActual) {
        PantallaLightNovel.HOME -> {
            LightNovelHomeScreen(
                onVerCatalogo = {
                    pantallaActual = PantallaLightNovel.CATALOGO
                }
            )
        }
        PantallaLightNovel.CATALOGO -> {
            LightNovelCatalogScreen(
                lightNovel = listaLightNovel,
                onLightNovelClick = { lightNovel ->
                    lightNovelSeleccionado = lightNovel
                    pantallaActual = PantallaLightNovel.DETALLE
                },
                onVolverInicio = {
                    pantallaActual = PantallaLightNovel.HOME
                }
            )
        }
        PantallaLightNovel.DETALLE -> {
            lightNovelSeleccionado?.let { lightNovel ->
                LightNovelDetailScreen(
                    lightNovel = lightNovel,
                    onVolverAlCatalogo = {
                        pantallaActual = PantallaLightNovel.CATALOGO
                    }
                )
            }
        }
    }
}