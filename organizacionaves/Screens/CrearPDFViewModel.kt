package com.example.organizacionaves.Screens

import android.graphics.Bitmap
import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CrearPDFViewModel: ViewModel(){



   private var cTexto1 by mutableStateOf("")
   private var cTexto2 by mutableStateOf("")
   private var cTexto3 by mutableStateOf("")
   private var cTexto4 by mutableStateOf("")
   private var cTexto5 by mutableStateOf("")
   private var cTexto6 by mutableStateOf("")
   private var cTexto7 by mutableStateOf("")
   private var cTexto8 by mutableStateOf("")
   private var cTexto9 by mutableStateOf("")
   private var cTexto10 by mutableStateOf("")
   private var cTexto11 by mutableStateOf("")
   private var cTexto12 by mutableStateOf("")
   private var cTexto13 by mutableStateOf("")
   private var cTexto14 by mutableStateOf("")
   private var cTexto15 by mutableStateOf("")
   private var cTexto16 by mutableStateOf("")
   private var cTexto17 by mutableStateOf("")
   private var cTexto18 by mutableStateOf("")
   private var cTexto19 by mutableStateOf("")
   private var cTexto20 by mutableStateOf("")
   private var cTexto21 by mutableStateOf("")
   private var cTexto22 by mutableStateOf("")
   private var cTexto23 by mutableStateOf("")
   private var cTexto24 by mutableStateOf("")
   private var cTexto25 by mutableStateOf("")
   private var cTexto26 by mutableStateOf("")
   private var cTexto27 by mutableStateOf("")
   private var cTexto28 by mutableStateOf("")
   private var cTexto29 by mutableStateOf("")
   private var cTexto30 by mutableStateOf("")
   private var cTexto31 by mutableStateOf("")
   private var cTexto32 by mutableStateOf("")
   private var cTexto33 by mutableStateOf("")
   private var cTexto34 by mutableStateOf("")
   private var cTexto35 by mutableStateOf("")
   private var cTexto36 by mutableStateOf("")
   private var cTexto37 by mutableStateOf("")
   private var cTexto38 by mutableStateOf("")
   private var cTexto39 by mutableStateOf("")
   private var cTexto40 by mutableStateOf("")
   private var cTexto41 by mutableStateOf("")
   private var cTexto42 by mutableStateOf("")
   private var cTexto43 by mutableStateOf("")
   private var cTexto44 by mutableStateOf("")
   private var cTexto45 by mutableStateOf("")
   private var cTexto46 by mutableStateOf("")
   private var cTexto47 by mutableStateOf("")
   private var cTexto48 by mutableStateOf("")
   private var cTexto49 by mutableStateOf("")
   private var cTexto50 by mutableStateOf("")
   private var cTexto51 by mutableStateOf("")
   private var cTexto52 by mutableStateOf("")
   private var cTexto53 by mutableStateOf("")
   private var cTexto54 by mutableStateOf("")
   private var cTexto55 by mutableStateOf("")
   private var cTexto56 by mutableStateOf("")
   private var cTexto57 by mutableStateOf("")
   private var cTexto58 by mutableStateOf("")
   private var cTexto59 by mutableStateOf("")
   private var cTexto60 by mutableStateOf("")
   private var cTexto61 by mutableStateOf("")
   private var cTexto62 by mutableStateOf("")
   private var cTexto63 by mutableStateOf("")
   private var cTexto64 by mutableStateOf("")
   private var cTexto65 by mutableStateOf("")
   private var cTexto66 by mutableStateOf("")
   private var cTexto67 by mutableStateOf("")
   private var cTexto68 by mutableStateOf("")
   private var cTexto69 by mutableStateOf("")
   private var cTexto70 by mutableStateOf("")


   val arregloCuadrosTexto = MutableStateFlow( listOf(
      cTexto1, cTexto2, cTexto3, cTexto4, cTexto5, cTexto6, cTexto7, cTexto8, cTexto9, cTexto10,
      cTexto11, cTexto12, cTexto13, cTexto14, cTexto15, cTexto16, cTexto17, cTexto18, cTexto19, cTexto20,
      cTexto21, cTexto22, cTexto23, cTexto24, cTexto25, cTexto26, cTexto27, cTexto28, cTexto29, cTexto30,
      cTexto31, cTexto32, cTexto33, cTexto34, cTexto35, cTexto36, cTexto37, cTexto38, cTexto39, cTexto40,
      cTexto41, cTexto42, cTexto43, cTexto44, cTexto45, cTexto46, cTexto47, cTexto48, cTexto49, cTexto50,
      cTexto51, cTexto52, cTexto53, cTexto54, cTexto55, cTexto56, cTexto57, cTexto58, cTexto59, cTexto60,
      cTexto61, cTexto62, cTexto63, cTexto64, cTexto65, cTexto66, cTexto67, cTexto68, cTexto69, cTexto70,
      )
   )
   fun updateArregloCuadrosTexto(newList: List<String>) {
      arregloCuadrosTexto.value = newList
   }

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

   val uriLists = mutableStateListOf<Uri>()

   private val _bitmaps = MutableStateFlow<List<Bitmap>>(emptyList())
   val bitmaps = _bitmaps.asStateFlow()

   fun onTakePhoto(bitmap: Bitmap) {
      _bitmaps.value += bitmap
   }
}
