package com.booktracker.app

import androidx.compose.runtime.*
import com.booktracker.app.screens.Adicionar
import com.booktracker.app.screens.Home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.booktracker.app.ui.theme.BookTrackerTheme
import androidx.compose.foundation.layout.padding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BookTrackerTheme {
                var telaAtual by remember {
                    mutableStateOf(Telas.HOME)
                }

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    when (telaAtual) {

                        Telas.HOME -> Home(
                            modifier = Modifier.padding(innerPadding),
                            abrirAdicionar = {
                                telaAtual = Telas.ADICIONAR
                            }
                        )

                        Telas.ADICIONAR -> Adicionar(
                            voltarHome = {
                                telaAtual = Telas.HOME
                            }
                        )

                    }

                }

                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun BookTrackerPreview() {
    BookTrackerTheme {
        Home(
            abrirAdicionar = {}
        )
    }
  }