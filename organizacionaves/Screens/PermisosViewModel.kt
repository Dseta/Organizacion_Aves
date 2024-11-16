package com.example.organizacionaves.Screens

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class PermisosViewModel: ViewModel() {

    val visiblePermissionDialogueQueue = mutableStateListOf<String>()

    fun dismissDialog(){
        visiblePermissionDialogueQueue.removeLast()
    }

    fun onPermissionResult(
        permission: String,
        isGranted: Boolean
    ){
        if (isGranted){

        }
    }
}