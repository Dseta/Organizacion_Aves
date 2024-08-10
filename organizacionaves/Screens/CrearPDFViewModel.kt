package com.example.organizacionaves.Screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CrearPDFViewModel: ViewModel(){

   var cTexto1 by mutableStateOf("")
   var cTexto2 by mutableStateOf("")
   var cTexto3 by mutableStateOf("")
   var cTexto4 by mutableStateOf("")
   var cTexto5 by mutableStateOf("")
   var cTexto6 by mutableStateOf("")
   var cTexto7 by mutableStateOf("")
   var cTexto8 by mutableStateOf("")
   var cTexto9 by mutableStateOf("")
   var cTexto10 by mutableStateOf("")
   var cTexto11 by mutableStateOf("")
   var cTexto12 by mutableStateOf("")
   var cTexto13 by mutableStateOf("")
   var cTexto14 by mutableStateOf("")
   var cTexto15 by mutableStateOf("")
   var cTexto16 by mutableStateOf("")
   var cTexto17 by mutableStateOf("")
   var cTexto18 by mutableStateOf("")
   var cTexto19 by mutableStateOf("")
   var cTexto20 by mutableStateOf("")
   var cTexto21 by mutableStateOf("")
   var cTexto22 by mutableStateOf("")
   var cTexto23 by mutableStateOf("")
   var cTexto24 by mutableStateOf("")
   var cTexto25 by mutableStateOf("")
   var cTexto26 by mutableStateOf("")
   var cTexto27 by mutableStateOf("")
   var cTexto28 by mutableStateOf("")
   var cTexto29 by mutableStateOf("")
   var cTexto30 by mutableStateOf("")
   var cTexto31 by mutableStateOf("")
   var cTexto32 by mutableStateOf("")
   var cTexto33 by mutableStateOf("")
   var cTexto34 by mutableStateOf("")
   var cTexto35 by mutableStateOf("")
   var cTexto36 by mutableStateOf("")
   var cTexto37 by mutableStateOf("")
   var cTexto38 by mutableStateOf("")
   var cTexto39 by mutableStateOf("")
   var cTexto40 by mutableStateOf("")
   var cTexto41 by mutableStateOf("")
   var cTexto42 by mutableStateOf("")
   var cTexto43 by mutableStateOf("")
   var cTexto44 by mutableStateOf("")
   var cTexto45 by mutableStateOf("")
   var cTexto46 by mutableStateOf("")
   var cTexto47 by mutableStateOf("")
   var cTexto48 by mutableStateOf("")
   var cTexto49 by mutableStateOf("")
   var cTexto50 by mutableStateOf("")
   var cTexto51 by mutableStateOf("")
   var cTexto52 by mutableStateOf("")
   var cTexto53 by mutableStateOf("")
   var cTexto54 by mutableStateOf("")
   var cTexto55 by mutableStateOf("")
   var cTexto56 by mutableStateOf("")
   var cTexto57 by mutableStateOf("")
   var cTexto58 by mutableStateOf("")
   var cTexto59 by mutableStateOf("")
   var cTexto60 by mutableStateOf("")
   var cTexto61 by mutableStateOf("")
   var cTexto62 by mutableStateOf("")
   var cTexto63 by mutableStateOf("")
   var cTexto64 by mutableStateOf("")
   var cTexto65 by mutableStateOf("")
   var cTexto66 by mutableStateOf("")
   var cTexto67 by mutableStateOf("")
   var cTexto68 by mutableStateOf("")
   var cTexto69 by mutableStateOf("")
   var cTexto70 by mutableStateOf("")


   val arregloCuadrosTexto = mutableStateListOf(
      cTexto1, cTexto2, cTexto3, cTexto4, cTexto5, cTexto6, cTexto7, cTexto8, cTexto9, cTexto10,
      cTexto11, cTexto12, cTexto13, cTexto14, cTexto15, cTexto16, cTexto17, cTexto18, cTexto19, cTexto20,
      cTexto21, cTexto22, cTexto23, cTexto24, cTexto25, cTexto26, cTexto27, cTexto28, cTexto29, cTexto30,
      cTexto31, cTexto32, cTexto33, cTexto34, cTexto35, cTexto36, cTexto37, cTexto38, cTexto39, cTexto40,
      cTexto41, cTexto42, cTexto43, cTexto44, cTexto45, cTexto46, cTexto47, cTexto48, cTexto49, cTexto50,
      cTexto51, cTexto52, cTexto53, cTexto54, cTexto55, cTexto56, cTexto57, cTexto58, cTexto59, cTexto60,
      cTexto61, cTexto62, cTexto63, cTexto64, cTexto65, cTexto66, cTexto67, cTexto68, cTexto69, cTexto70,
   )

   var radioButtonsState1 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState2 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState3 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState4 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState5 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState6 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState7 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState8 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState9 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState10 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState11 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState12 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState13 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState14 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var radioButtonsState15 = mutableStateListOf(
      ToggleableInfo(isChecked = true, radioButtonNumber = 0),
      ToggleableInfo(isChecked = false, radioButtonNumber = 1),
      ToggleableInfo(isChecked = false, radioButtonNumber = 2),
      ToggleableInfo(isChecked = false, radioButtonNumber = 3),
      ToggleableInfo(isChecked = false, radioButtonNumber = 4),
      ToggleableInfo(isChecked = false, radioButtonNumber = 5),
      ToggleableInfo(isChecked = false, radioButtonNumber = 6),
      ToggleableInfo(isChecked = false, radioButtonNumber = 7),
      ToggleableInfo(isChecked = false, radioButtonNumber = 8)
   )

   var checkBoxState = mutableStateListOf(
      CheckBoxToggleableInfo(isChecked = false, checkBoxNumber = 0),
      CheckBoxToggleableInfo(isChecked = false, checkBoxNumber = 1),
      CheckBoxToggleableInfo(isChecked = false, checkBoxNumber = 2),
      CheckBoxToggleableInfo(isChecked = false, checkBoxNumber = 3),
      CheckBoxToggleableInfo(isChecked = false, checkBoxNumber = 4),
      CheckBoxToggleableInfo(isChecked = false, checkBoxNumber = 5),
      CheckBoxToggleableInfo(isChecked = false, checkBoxNumber = 6),
      CheckBoxToggleableInfo(isChecked = false, checkBoxNumber = 7),
   )
}

//private val _cuadroTexto1 = mutableStateOf(TextFieldStates())
//val cuadroTexto1: State<TextFieldStates> = _cuadroTexto1