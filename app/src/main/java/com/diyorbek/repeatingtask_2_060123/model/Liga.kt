package com.diyorbek.repeatingtask_2_060123.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Liga(
    val ligaImg: Int,
    val ligaName: String,
    val ligaCIty: String,
    val ligaTeam: List<Team>
): Parcelable
