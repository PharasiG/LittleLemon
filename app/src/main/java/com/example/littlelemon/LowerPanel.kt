package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}

@Composable
fun WeeklySpecial() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(0.dp)
    ) {
        Text(
            text = "Weekly Special",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun MenuDish() {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(0.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(.75f)
            ) {
                Text(
                    text = "Greek Salad",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "The famous Greek Salad of crispy lettuce, peppers, olives, our Uttarakhand ...",
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                )
                Text(
                    text = "₹150",
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
            }
            Image(
                painter = painterResource(id = R.drawable.greeksalad),
                contentDescription = "Greek Salad Image"
            )
        }
    }
    HorizontalDivider(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        thickness = 1.dp,
        color = Color.LightGray
    )
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview() {
    LowerPanel()
}
