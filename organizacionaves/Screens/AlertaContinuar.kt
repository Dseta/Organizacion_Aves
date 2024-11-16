package com.example.organizacionaves.Screens

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.DialogProperties

@Composable
fun AlertaContinuar(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    onContinue: () -> Unit,
    text: String
) {
    if (showDialog) {
        AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text(text = "Advertencia") },
            text = { Text(text) },
            confirmButton = {
                Button(onClick = onContinue) {
                    Text("Continuar de todos modos")
                }
            },
            dismissButton = {
                Button(onClick = onDismiss) {
                    Text("No continuar")
                }
            },
            properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
        )
    }
}