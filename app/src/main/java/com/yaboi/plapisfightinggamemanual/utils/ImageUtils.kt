package com.yaboi.plapisfightinggamemanual.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.File
import java.io.FileOutputStream

object ImageUtils {
    fun saveSplashImage(context: Context, bitmap: Bitmap) {
        try {
            val file = File(context.filesDir, "splash_image.png")
            FileOutputStream(file).use { out ->
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun saveSplashImage(context: Context, imageByteArray: ByteArray) {
        try {
            val bitmap = BitmapFactory.decodeByteArray(imageByteArray, 0, imageByteArray.size)
            saveSplashImage(context, bitmap)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
} 