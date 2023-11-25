package com.fisi.tallersw.g9.lms.screens.chat

import android.annotation.SuppressLint
import android.util.Log
import android.view.ViewGroup
import android.webkit.ConsoleMessage
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.*
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.LocalTextInputService
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.fisi.tallersw.g9.lms.ui.theme.LMSSecondary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@SuppressLint("UnrememberedMutableState", "UnusedMaterialScaffoldPadding",
    "UnusedMaterial3ScaffoldPaddingParameter"
)

fun ChatScreen(navController: NavController) {
    val url = "https://chat-app-8d8ac2.zapier.app/zapchat"
    val context = LocalContext.current


    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarColors(
                    containerColor = LMSSecondary,
                    actionIconContentColor= Color.White,
                    navigationIconContentColor=Color.White,
                    scrolledContainerColor= LMSSecondary,
                    titleContentColor= LMSSecondary
                    ),
                title = {
                    Text(
                        "Mis preguntas",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White),
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigateUp()
                    }) {
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowLeft,
                            contentDescription = "Localized description"
                        )
                    }
                }
    
            )
        },

        content= {
            // Pantalla compuesta con un WebView
            AndroidView(
                factory = { context ->
                    WebView(context).apply {
                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT
                        )

                        webChromeClient = object : WebChromeClient() {
                            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                                // Puedes utilizar este método para manejar el progreso de carga si es necesario
                            }

                            override fun onConsoleMessage(consoleMessage: ConsoleMessage): Boolean {
                                // Enviar mensajes de la consola al Logcat
                                Log.d("WebView", "${consoleMessage.message()} -- From line ${consoleMessage.lineNumber()} of ${consoleMessage.sourceId()}")
                                return true
                            }
                        }

                        settings.cacheMode = WebSettings.LOAD_DEFAULT
                        settings.javaScriptEnabled = true
                        settings.setGeolocationEnabled(true)
                        settings.domStorageEnabled = true
                        settings.javaScriptCanOpenWindowsAutomatically = true
                        settings.mediaPlaybackRequiresUserGesture = false
                        settings.allowContentAccess = true
                        settings.allowFileAccess = true
                        settings.supportMultipleWindows()

                        settings.javaScriptEnabled = true
                        loadUrl(url)
                    }
                },
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    )
}

/*
fun ChatScreen(navController: NavController) {
    var message by remember { mutableStateOf("") }

    var messages by remember { mutableStateOf(listOf("Hello!", "Hi there!", "Compose is awesome!")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Chat messages
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(messages.size) { index ->
                ChatMessage(messages[index])
            }
        }

        // Input field and send button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = message,
                onValueChange = { message = it },
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Transparent),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Send
                ),
                keyboardActions = KeyboardActions(
                    onSend = {
                        if (message.isNotBlank()) {
                            messages = messages + message
                            message = ""
                        }
                    }
                ),
                trailingIcon = {
                    IconButton(
                        onClick = {
                            if (message.isNotBlank()) {
                                messages = messages + message
                                message = ""
                            }
                        }
                    ) {
                        Icon(Icons.Default.Send, contentDescription = "Send")
                    }
                }
            )

            Spacer(modifier = Modifier.width(8.dp))

            /* Si prefieres un botón en lugar de un ícono para enviar:
            Button(
                onClick = {
                    if (message.isNotBlank()) {
                        messages = messages + message
                        message = ""
                    }
                },
                modifier = Modifier
                    .height(56.dp)
            ) {
                Text("Send")
            }
            */
        }
    }
}


@Composable
fun ChatMessage(message: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.End
    ) {
        Card(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.secondary)
                .padding(8.dp)
        ) {
            Text(message)
        }
    }
}

@Preview()
@Composable
fun ChatMessagePreview() {

}
*/
