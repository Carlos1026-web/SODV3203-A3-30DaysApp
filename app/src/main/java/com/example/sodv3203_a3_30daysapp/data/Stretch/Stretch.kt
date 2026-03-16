package com.example.sodv3203_a3_30daysapp.data.Stretch

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.sodv3203_a3_30daysapp.R

class Stretch (
    @DrawableRes val imageResourceId: Int,
    val day: String,
    @StringRes val description: Int
    )

val stretches = listOf(
    Stretch(R.drawable.day1, "Day 1", R.string.day_1_excercise),
    Stretch(R.drawable.day2, "Day 2", R.string.day_2_excercise),
    Stretch(R.drawable.day3, "Day 3", R.string.day_3_excercise),
    Stretch(R.drawable.day4, "Day 4", R.string.day_4_excercise),
    Stretch(R.drawable.day5, "Day 5", R.string.day_5_excercise),
    Stretch(R.drawable.day6, "Day 6", R.string.day_6_excercise),
    Stretch(R.drawable.day7, "Day 7", R.string.day_7_excercise),
    Stretch(R.drawable.day8, "Day 8", R.string.day_8_excercise),
    Stretch(R.drawable.day9, "Day 9", R.string.day_9_excercise),
    Stretch(R.drawable.day10, "Day 10", R.string.day_10_excercise),

    Stretch(R.drawable.day11, "Day 11", R.string.day_11_excercise),
    Stretch(R.drawable.day12, "Day 12", R.string.day_12_excercise),
    Stretch(R.drawable.day13, "Day 13", R.string.day_13_excercise),
    Stretch(R.drawable.day14, "Day 14", R.string.day_14_excercise),
    Stretch(R.drawable.day15, "Day 15", R.string.day_15_excercise),
    Stretch(R.drawable.day16, "Day 16", R.string.day_16_excercise),
    Stretch(R.drawable.day17, "Day 17", R.string.day_17_excercise),
    Stretch(R.drawable.day18, "Day 18", R.string.day_18_excercise),
    Stretch(R.drawable.day19, "Day 19", R.string.day_19_excercise),
    Stretch(R.drawable.day20, "Day 20", R.string.day_20_excercise),

    Stretch(R.drawable.day21, "Day 21", R.string.day_21_excercise),
    Stretch(R.drawable.day22, "Day 22", R.string.day_22_excercise),
    Stretch(R.drawable.day23, "Day 23", R.string.day_23_excercise),
    Stretch(R.drawable.day24, "Day 24", R.string.day_24_excercise),
    Stretch(R.drawable.day25, "Day 25", R.string.day_25_excercise),
    Stretch(R.drawable.day26, "Day 26", R.string.day_26_excercise),
    Stretch(R.drawable.day27, "Day 27", R.string.day_27_excercise),
    Stretch(R.drawable.day28, "Day 28", R.string.day_28_excercise),
    Stretch(R.drawable.day29, "Day 29", R.string.day_29_excercise),
    Stretch(R.drawable.day30, "Day 30", R.string.day_30_excercise),
)