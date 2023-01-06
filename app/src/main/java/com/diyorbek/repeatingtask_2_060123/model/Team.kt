package com.diyorbek.repeatingtask_2_060123.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    val image: Int,
    val name: String,
    val d1: String,
    val d2: String,
    val d3: String,
    val d4: String,
    val d5: String,
): Parcelable
