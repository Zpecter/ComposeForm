package com.jfma75.composeform

import android.os.Build
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import com.jfma75.composeform.app.ComposeFormApp
import com.jfma75.composeform.screens.LoginScreen
import kotlinx.coroutines.InternalCoroutinesApi

@InternalCoroutinesApi
@ExperimentalComposeUiApi
class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFormApp {
                LoginScreen()
            }
        }
    }
}

@InternalCoroutinesApi
@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@ExperimentalComposeUiApi
@Composable
fun DefaultPreview() {
    ComposeFormApp {
        LoginScreen()
    }
}