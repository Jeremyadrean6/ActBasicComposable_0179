package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun Kolom(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(
            top = 16.dp,
            start = 12.dp,
            bottom = 16.dp,
            end = 12.dp
        )
    ) {
        Text("hello kelas D")
        Text(
            text = "Ini kolom ke 1",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            fontFamily = fontFamily.Cursive,
        )

        Text(
            text = "Ini kolom ke 2",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            fontFamily = fontFamily.Cursive,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Baris(modifier: Modifier = Modifier) {
    run(modifier = Modifier.padding(12.dp,
        start = 12.dp,))
        val row1 = stringResource(id = R.string.row1)
        val row2 = stringResource(id = R.string.row2)
        val row3 = stringResource(id = R.string.row3)
        val row4 = stringResource(id = R.string.row4)

}

@Composable
fun Gambar(modifGambar: Modifier)