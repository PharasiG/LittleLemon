package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.DrawerState
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopAppBar(drawerState: DrawerState? = null, scope: CoroutineScope? = null) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(
            onClick = {
                scope?.launch { drawerState?.open() }
            }
        ) {
            Image(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu Icon",
                modifier = Modifier.size(24.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Little Lemon Logo",
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .height(26.dp)
        )
        IconButton( onClick = { /*TODO*/ } ){
            Image(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "Cart Icon",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}
