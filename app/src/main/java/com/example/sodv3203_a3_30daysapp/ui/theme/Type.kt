package com.example.sodv3203_a3_30daysapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.sodv3203_a3_30daysapp.R

val AnekLatin = FontFamily(Font(R.font.anek_latin_variable_font_wdth))


// Default Material 3 typography values
val baseline = Typography()

val AppTypography = Typography(
    displayLarge = TextStyle (
        fontFamily = AnekLatin,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = AnekLatin,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    displaySmall = TextStyle(
        fontFamily = AnekLatin,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = AnekLatin,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    )
)