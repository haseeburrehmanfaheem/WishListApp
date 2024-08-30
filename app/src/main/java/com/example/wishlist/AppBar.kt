package com.example.wishlist

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun AppBarView(title: String, onBackNavClicled : () -> Unit = {}){



    val navigationIcon: (@Composable () -> Unit)? = if (!title.contains("WishList")) {
        {
            IconButton(onClick = { onBackNavClicled() }) {
                androidx.compose.material3.Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back button",
                    tint = Color.White
                )
            }
        }
    } else {
        null
    }


    TopAppBar(title = { Text(text = title, color = colorResource(id = R.color.white),modifier = Modifier
        .padding(start = 4.dp)
        .heightIn(max = 24.dp))},
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.app_bar_color),
        navigationIcon = navigationIcon
        )
}