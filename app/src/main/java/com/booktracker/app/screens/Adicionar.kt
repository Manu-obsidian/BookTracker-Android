package com.booktracker.app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
@Composable
fun Adicionar(
    voltarHome: () -> Unit
) {

    var titulo by remember {
        mutableStateOf("")
    }

    var autor by remember {
        mutableStateOf("")
    }

    var genero by remember {
        mutableStateOf("")
    }

    var paginas by remember {
        mutableStateOf("")
    }

    var sinopse by remember {
        mutableStateOf("")
    }

    var tipoObra by remember {
        mutableStateOf("Livro")
    }

    var expandirTipoObra by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF3EFE6))
            .padding(16.dp)
    ) {

        Text(
            text = "Novo Livro",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3D1D10)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = voltarHome,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF542916)
            )
        ) {
            Text(
                text = "← Voltar",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = titulo,
            onValueChange = {
                titulo = it
            },
            label = {
                Text("Título")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,

                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = autor,
            onValueChange = {
                autor = it
            },
            label = {
                Text("Autor")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,

                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Tipo de Obra",
            color = Color.Black
        )

        Button(
            onClick = {
                expandirTipoObra = true
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(tipoObra)
        }

        DropdownMenu(
            expanded = expandirTipoObra,
            onDismissRequest = {
                expandirTipoObra = false
            }
        ) {

            DropdownMenuItem(
                text = { Text("Livro") },
                onClick = {
                    tipoObra = "Livro"
                    expandirTipoObra = false
                }
            )

            DropdownMenuItem(
                text = { Text("Mangá") },
                onClick = {
                    tipoObra = "Mangá"
                    expandirTipoObra = false
                }
            )

            DropdownMenuItem(
                text = { Text("HQ") },
                onClick = {
                    tipoObra = "HQ"
                    expandirTipoObra = false
                }
            )

            DropdownMenuItem(
                text = { Text("Novel") },
                onClick = {
                    tipoObra = "Novel"
                    expandirTipoObra = false
                }
            )

            DropdownMenuItem(
                text = { Text("Light Novel") },
                onClick = {
                    tipoObra = "Light Novel"
                    expandirTipoObra = false
                }
            )

            DropdownMenuItem(
                text = { Text("Manhwa") },
                onClick = {
                    tipoObra = "Manhwa"
                    expandirTipoObra = false
                }
            )

            DropdownMenuItem(
                text = { Text("Manhua") },
                onClick = {
                    tipoObra = "Manhua"
                    expandirTipoObra = false
                }
            )

            DropdownMenuItem(
                text = { Text("Webtoon") },
                onClick = {
                    tipoObra = "Webtoon"
                    expandirTipoObra = false
                }
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = genero,
            onValueChange = {
                genero = it
            },
            label = {
                Text("Gênero")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = paginas,
            onValueChange = {
                paginas = it
            },
            label = {
                Text("Total de páginas")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = sinopse,
            onValueChange = {
                sinopse = it
            },
            label = {
                Text("Sinopse")
            },
            modifier = Modifier.fillMaxWidth(),
            minLines = 4,
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF542916),
                contentColor = Color.White
            )
        ) {
            Text("Salvar Livro")
        }
    }
}