package com.booktracker.app.screens

import com.booktracker.app.components.StatCard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home(
    modifier: Modifier = Modifier,
    abrirAdicionar: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF3EFE6))
            .padding(16.dp)
    ) {

        Text(
            text = "📚 BookTracker",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF542916)
        )

        Text(
            text = "Sua biblioteca pessoal",
            color = Color(0xFFB79858)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            StatCard(
                "Total",
                "0",
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(12.dp))

            StatCard(
                "Favoritos",
                "0",
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            StatCard(
                "Lendo",
                "0",
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(12.dp))

            StatCard(
                "Lidos",
                "0",
                modifier = Modifier.weight(1f)
            )

        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = abrirAdicionar,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF542916)
            )
        ) {
            Text(
                text = "+ Adicionar Livro",
                color = Color.White
            )
        }

    }
}