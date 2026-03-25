package com.example.laboratorio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laboratorio2.ui.theme.Laboratorio2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio2Theme{
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ListaNombre(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun ListaNombre(modifier: Modifier) {
    //
    var nombre by remember { mutableStateOf("") }

    // Almacenamiento en la lista
    val listaNombres = remember { mutableStateListOf<String>() }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(18.dp)
    ) {
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Agrega un nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(18.dp))

        Button(
            onClick = {
                if (nombre.isNotBlank()) {
                    listaNombres.add(nombre)
                    nombre = ""
                }
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Agrega")
        }

        Spacer(modifier = Modifier.height(24.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Listado de Nombres y posicion en la lista",
                modifier = Modifier.weight(1f)
            )

            Button(
                onClick = {
                    listaNombres.clear()
                }
            ) {
                Text("Limpiar")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


        Box(
            modifier = Modifier
                .fillMaxSize()
                .border(
                    width = 4.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp)
        ) {


            LazyColumn {
                itemsIndexed(listaNombres) { index, item ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = item)
                        Text(text = (index + 1).toString())
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Laboratorio2Theme {
        ListaNombre(
            modifier = TODO()
        )
    }
}















