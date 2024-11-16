package com.example.organizacionaves.Screens

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.pdf.PdfDocument
import android.net.Uri
import android.os.Environment
import android.widget.Toast
import com.example.organizacionaves.R
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.InputStream
import java.text.SimpleDateFormat
import java.util.Date

@SuppressLint("SimpleDateFormat")
fun GeneradorPDF(context: Context, crearPDFViewModel: CrearPDFViewModel, prueba: List<String>) {

    val pdfDocument = PdfDocument()
    val pageInfo = PdfDocument.PageInfo.Builder(2040, 2600, 1).create()
    val page = pdfDocument.startPage(pageInfo)

    val canvas: Canvas = page.canvas
    val bitmap = drawableToBitmap(context.resources.getDrawable(R.drawable.pagina1))
    val scaledbmp = Bitmap.createScaledBitmap(bitmap, (bitmap.width/1.65).toInt(), (bitmap.height/1.65).toInt(), true)
    val paint = Paint()
    val title = Paint()
    paint.color = Color.BLACK
    paint.textSize = 30f

    val sdf = SimpleDateFormat("dd-MM-yyyy")
    val sdf2 = SimpleDateFormat("yy-MM-dd")
    //val sdf = SimpleDateFormat("'Date\n'dd-MM-yyyy '\n\nand\n\nTime\n'HH:mm:ss z")

    // on below line we are creating a variable for
    // current date and time and calling a simple
    // date format in it.
    val currentDateAndTime = sdf.format(Date())
    val currentDateandTime2 = sdf2.format(Date())

    val posiciones = Preguntas_Base().posicionamientoPDF()

    canvas.drawBitmap(scaledbmp, 0f, 0f, paint)
    canvas.drawText(currentDateAndTime, 240f, 248f, paint)
    paint.setTypeface(Typeface.SANS_SERIF)
    paint.textSize = 33f

    for(i in 0..21){
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)
            ?.let { canvas.drawText(it, posiciones[i][0], posiciones[i][1], paint) }
    }

    //Salto a la tercera seccion  -No se han agregado a la lista
    title.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD))

    if(crearPDFViewModel.radioButtonsState1[0].isChecked)
        canvas.drawText("X", 371f, 1030f, paint)
    if (crearPDFViewModel.radioButtonsState1[1].isChecked)
        canvas.drawText("X", 507f, 1030f, paint)
    if (crearPDFViewModel.radioButtonsState1[2].isChecked)
        canvas.drawText("X", 636f, 1030f, paint)
    if (crearPDFViewModel.radioButtonsState1[3].isChecked)
        canvas.drawText("X", 761f, 1030f, paint)

    if (crearPDFViewModel.radioButtonsState2[0].isChecked)
        canvas.drawText("X", 1425f, 1030f, paint)
    if (crearPDFViewModel.radioButtonsState2[1].isChecked)
        canvas.drawText("X", 1667f, 1030f, paint)
    if (crearPDFViewModel.radioButtonsState2[2].isChecked)
        canvas.drawText("X", 1891f, 1030f, paint)
    if (crearPDFViewModel.radioButtonsState2[3].isChecked)
        canvas.drawText("X", 485f, 1078f, paint)


    crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(22)
        ?.let { canvas.drawText(it, 555f, 1124f, paint) }
    crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(23)
        ?.let { canvas.drawText(it, 1595f, 1124f, paint) }

    if (crearPDFViewModel.radioButtonsState3[0].isChecked){
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(24)
            ?.let { canvas.drawText(it, 635f, 1174f, paint) }
    }
    else{
        canvas.drawText("Ninguna", 635f, 1174f, paint)
    }

    if (crearPDFViewModel.checkBoxState[0].isChecked)
        canvas.drawText("X", 347f, 1224f, paint)
    if (crearPDFViewModel.checkBoxState[1].isChecked)
        canvas.drawText("X", 491f, 1224f, paint)
    if (crearPDFViewModel.checkBoxState[2].isChecked)
        canvas.drawText("X", 832f, 1224f, paint)
    if (crearPDFViewModel.checkBoxState[3].isChecked)
        canvas.drawText("X", 1013f, 1224f, paint)
    if (crearPDFViewModel.checkBoxState[4].isChecked)
        canvas.drawText("X", 1162f, 1224f, paint)
    if (crearPDFViewModel.checkBoxState[5].isChecked)
        canvas.drawText("X", 1453f, 1224f, paint)
    if (crearPDFViewModel.checkBoxState[6].isChecked)
        canvas.drawText("X", 1701f, 1224f, paint)
    if (crearPDFViewModel.checkBoxState[7].isChecked)
        canvas.drawText("X", 1901f, 1224f, paint)

    var suport = false
    for(i in crearPDFViewModel.checkBoxState){
        if(i.isChecked){
            suport = true
            break
        }
    }
    //De que tipo
    if(suport){
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(25)
            ?.let { canvas.drawText(it, 355f, 1272f, paint) }
    }
    else{
        canvas.drawText("Ninguno", 355f, 1272f, paint)
    }

    //Tomar el sol
    if (crearPDFViewModel.radioButtonsState4[0].isChecked){
        canvas.drawText("X", 366f, 1322f, paint)
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(26)
            ?.let { canvas.drawText(it, 795f, 1322f, paint) }
    }
    if (crearPDFViewModel.radioButtonsState4[1].isChecked){
        canvas.drawText("X", 465f, 1322f, paint)
        canvas.drawText("Ninguno", 795f, 1322f, paint)
    }

    //Se baña
    if (crearPDFViewModel.radioButtonsState5[0].isChecked){
        canvas.drawText("X", 1350f, 1322f, paint)
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(27)
            ?.let { canvas.drawText(it, 1670f, 1322f, paint) }
    }
    if (crearPDFViewModel.radioButtonsState5[1].isChecked){
        canvas.drawText("X", 1450f, 1322f, paint)
        canvas.drawText("Ninguna", 1670f, 1322f, paint)
    }

    for(i in 0..10){
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i+28)
            ?.let { canvas.drawText(it, posiciones[i+22][0], posiciones[i+22][1], paint) }
    }

    if (crearPDFViewModel.radioButtonsState6[0].isChecked){
        canvas.drawText("X", 930f, 1711f, paint)
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(39)
            ?.let { canvas.drawText(it, 1400f, 1711f, paint) }
    }
    if (crearPDFViewModel.radioButtonsState6[1].isChecked){
        canvas.drawText("X", 1030f, 1711f, paint)
          canvas.drawText("Ninguno", 1400f, 1711f, paint)
    }

    pdfDocument.finishPage(page)

    val pageInfo2 = PdfDocument.PageInfo.Builder(2040, 2600, 2).create()
    val page2 = pdfDocument.startPage(pageInfo2)
    val canvas2: Canvas = page2.canvas
    val bitmap2 = drawableToBitmap(context.resources.getDrawable(R.drawable.pagina2))
    val scaledbmp2 = Bitmap.createScaledBitmap(bitmap2, (bitmap2.width/1.65).toInt(), (bitmap2.height/1.65).toInt(), true)
    val paint2 = Paint()
    paint2.color = Color.BLACK
    paint2.textSize = 33f
    paint2.setTypeface(Typeface.SANS_SERIF)

    canvas2.drawBitmap(scaledbmp2, 0f, 0f, paint2)

    for(i in 0..13){
        if(i<=6 || i==12)
            crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(40+i)
                ?.let { canvas2.drawText(it, posiciones[33+i][0], posiciones[33+i][1], paint2) }
        else
            crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(40+i)
                ?.let { saLtoDeLinea(paint2,canvas2,posiciones[33+i][0],posiciones[33+i][1], it) }
    }

    if (crearPDFViewModel.radioButtonsState7[0].isChecked)
        canvas2.drawText("X", 282f, 1782f, paint2)
    if (crearPDFViewModel.radioButtonsState7[1].isChecked)
        canvas2.drawText("X", 489f, 1782f, paint2)
    if (crearPDFViewModel.radioButtonsState7[2].isChecked)
        canvas2.drawText("X", 709f, 1782f, paint2)

    pdfDocument.finishPage(page2)

    if(!crearPDFViewModel.uriLists.isEmpty()){
        cicladoFotos(pdfDocument,context,crearPDFViewModel)
    }


    val pdfFile = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
        currentDateandTime2 +"_${crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(3)}"
                +"_${crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(0)}"
                +"_${crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(4)}"+".pdf" //fecha año-mes-dia_NombrePaciente_NombrePaciente_Especie
    );
    //val pdfFile2 = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "GFG.pdf");
    val outputStream = FileOutputStream(pdfFile)
    try {
        // Crear y escribir el archivo PDF
        pdfDocument.writeTo(outputStream)
        Toast.makeText(context, "El PDF se creo correctamente", Toast.LENGTH_SHORT).show()
    } catch (e: Exception) {
        // Manejar la excepción (por ejemplo, mostrar un mensaje de error)
        e.printStackTrace()
        Toast.makeText(context, "Hubo un error al crear el PDF: "+ e, Toast.LENGTH_SHORT).show()
    } finally {
        // Cerrar el flujo de salida y el documento PDF
        outputStream.close()
        pdfDocument.close()
    }

}

fun drawableToBitmap(drawable: Drawable): Bitmap {
    if (drawable is BitmapDrawable) {
        return drawable.bitmap
    }
    val bitmap = Bitmap.createBitmap(drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)

    drawable.setBounds(0, 0, canvas.width, canvas.height)
    drawable.draw(canvas)
    return bitmap
}

fun saLtoDeLinea(paint: Paint, canvas: Canvas, x: Float, y: Float, texto: String){

    val palabras = texto.split(" ")

    var posX = x
    var posY = y
    val espacioEntreLineas = 50f // Espacio entre líneas (ajústalo según tus necesidades)

    for (palabra in palabras) {
        val longitudPalabra = paint.measureText(palabra)

        if (posX + longitudPalabra > 1925f) {
            // La palabra no cabe en la línea actual, así que saltamos a la siguiente línea
            posX = 90f
            posY += espacioEntreLineas
        }

        canvas.drawText(palabra, posX, posY, paint)
        posX += longitudPalabra + paint.measureText(" ") // Agregamos espacio entre palabras
    }
}

fun loadBitmapFromUri(context: Context, imageUri: Uri): Bitmap? {
    var inputStream: InputStream? = null
    try {
        inputStream = context.contentResolver.openInputStream(imageUri)
        return BitmapFactory.decodeStream(inputStream)
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } finally {
        inputStream?.close()
    }
    return null
}

fun cicladoFotos(pdfDocument: PdfDocument, context: Context, crearPDFViewModel: CrearPDFViewModel,){

    val imagesPerPage = 4
    var currentPage = 0

    crearPDFViewModel.uriLists.chunked(imagesPerPage).forEach { imageUriGroup ->
        val pageInfo = PdfDocument.PageInfo.Builder(2040, 2600, 1).create()
        val page = pdfDocument.startPage(pageInfo)
        val canvas = page.canvas

        imageUriGroup.forEachIndexed { index, imageUri ->
            val bitmap = loadBitmapFromUri(context, imageUri)
            val left = (index % 2) * (canvas.width / 2)
            val top = (index / 2) * (canvas.height / 2)
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, left.toFloat(), top.toFloat(), null)
            }
        }

        pdfDocument.finishPage(page)
        currentPage++
    }
}