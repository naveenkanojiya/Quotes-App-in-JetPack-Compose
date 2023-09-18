package com.example.quotecomposeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quotecomposeapp.Models.Quote
import com.example.quotecomposeapp.R
//import quotes

@Composable
fun QuoteListScreen(data:Array<Quote>, onclick:(quote: Quote) ->Unit){

    Column() {
        Text(text = "Quote App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.headlineSmall,
            fontFamily = FontFamily(Font(R.font.montserratr))
        )
        QuoteList(data = data,onclick)
    }

}