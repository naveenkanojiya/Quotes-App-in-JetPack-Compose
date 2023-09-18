package com.example.quotecomposeapp

import android.content.Context
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import com.example.quotecomposeapp.Models.Quote
import com.google.gson.Gson
import java.nio.charset.Charset

object DataManager {

    var data = emptyArray<Quote>()
    var currentQuote: Quote? = null

    var currentPage = mutableStateOf(Pages.MAINSCREEN)
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.txt")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value = true


    }

    fun switchPages(quote: Quote?) {
        if (currentPage.value == Pages.MAINSCREEN) {
            currentQuote = quote
            currentPage.value == Pages.DETAILSCREEN
        } else {
            currentPage.value == Pages.MAINSCREEN
        }
    }


}