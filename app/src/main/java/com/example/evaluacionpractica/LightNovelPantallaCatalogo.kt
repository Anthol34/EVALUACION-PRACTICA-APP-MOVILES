package com.example.evaluacionpractica

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.evaluacionpractica.data.LightNovel
import com.example.evaluacionpractica.data.listaLightNovel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LightNovelCatalogScreen(
    lightNovel: List<LightNovel>,
    onLightNovelClick: (LightNovel) -> Unit,
    onVolverInicio: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Explora Obras Destacadas") },
                navigationIcon = {
                    IconButton(onClick = onVolverInicio) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Regresar al inicio")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(lightNovel) { lightNovel ->
                LightNovelItemCard(
                    lightNovel = lightNovel,
                    onClick = { onLightNovelClick(lightNovel) }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LightNovelCatalogScreenPreview() {
    com.example.evaluacionpractica.ui.theme.EVALUACIONPRACTICATheme {
        LightNovelCatalogScreen(
            lightNovel = listaLightNovel,
            onLightNovelClick = {},
            onVolverInicio = {}
        )
    }
}