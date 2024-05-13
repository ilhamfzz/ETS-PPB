package com.ilhamfakhri.uts_ppb_b.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ilhamfakhri.uts_ppb_b.Routes

@Composable
fun Pin(navController: NavController) {
    var pin by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Masukkan PIN Keamanan", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(24.dp))

        // TextField untuk memasukkan PIN dengan tampilan teks ditengah (centered)
        TextField(
            value = pin,
            onValueChange = { pin = it },
            modifier = Modifier.width(200.dp),
            textStyle = TextStyle(fontSize = 24.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            visualTransformation = PasswordVisualTransformation(mask = '*')
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                // Tambahkan logika validasi PIN di sini
                if (pin == "123456") {
                    // PIN benar, lakukan sesuatu (navigasi, dll.)
                    navController.navigate(Routes.Home.route)
                } else {
                    // PIN salah, tampilkan pesan kesalahan
                }
            }
        ) {
            Text("Submit", fontSize = 18.sp)
        }
    }
}