package com.example.organizacionaves.Screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PictureSelector(crearPDFViewModel: CrearPDFViewModel) {

    //val imageUriList = remember { mutableStateListOf<Uri>() }
    val imageUriList = crearPDFViewModel.uriLists

    val imageStates = remember { mutableStateMapOf<Int, Boolean>() }

    //val scrollState = rememberScrollState()


    val galleryLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetMultipleContents(),
        onResult = { uriList ->
            imageUriList.addAll(uriList)
        }
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            var expanded by remember { mutableStateOf(false) }
            LazyRow(modifier = Modifier.fillMaxSize())
            {
                item {
                    imageUriList.forEachIndexed() { index, imageUri ->
                        val isExpanded = imageStates[index] ?: false
                        Image(
                            painter = rememberAsyncImagePainter(
                                model = ImageRequest.Builder(LocalContext.current)
                                    .data(imageUri)
                                    .build()
                            ),
                            contentDescription = null,
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .size(if (isExpanded) 300.dp else 150.dp)
                                .animateContentSize()
                                .padding(4.dp)
                                .combinedClickable(
                                    onLongClick = {
                                        imageUriList.remove(imageUri)
                                    },
                                    onClick = {
                                        imageStates[index] = !isExpanded
                                    }
                                )
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Button(
                onClick = { galleryLauncher.launch("image/*") }
            ) {
                Text("Seleccionar imágenes")
            }
        }
    }

}