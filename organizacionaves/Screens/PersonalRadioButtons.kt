package com.example.organizacionaves.Screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

@Composable
fun PersonalRadioButton() {

    val radioButtons = remember {
        mutableStateListOf(
            ToggleableInfo(
                isChecked = true,
                radioButtonNumber = 0
            ),
            ToggleableInfo(
                isChecked = false,
                radioButtonNumber = 1
            ),
            ToggleableInfo(
                isChecked = false,
                radioButtonNumber = 2
            ),
            ToggleableInfo(
                isChecked = false,
                radioButtonNumber = 3
            ),
            ToggleableInfo(
                isChecked = false,
                radioButtonNumber = 4
            ),
            ToggleableInfo(
                isChecked = false,
                radioButtonNumber = 5
            ),
            ToggleableInfo(
                isChecked = false,
                radioButtonNumber = 6
            ),
            ToggleableInfo(
                isChecked = false,
                radioButtonNumber = 7
            ),
            ToggleableInfo(
                isChecked = false,
                radioButtonNumber = 8
            ),
        )
    }
}