package com.jdpadillavigo.cmp_theming

import androidx.compose.runtime.Composable
import com.jdpadillavigo.cmp_theming.login.LoginScreen
import com.jdpadillavigo.cmp_theming.theme.NoteMarkTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    NoteMarkTheme {
        LoginScreen()
    }
}