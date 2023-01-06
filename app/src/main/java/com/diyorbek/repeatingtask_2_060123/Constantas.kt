package com.diyorbek.repeatingtask_2_060123

import com.diyorbek.repeatingtask_2_060123.model.Liga
import com.diyorbek.repeatingtask_2_060123.model.Team

object Constantas {
    fun list(): MutableList<Liga>{
        return mutableListOf(
            Liga(R.drawable.spain_flag,"La Liga","Spain", teamList()),
            Liga(R.drawable.englangd_flag,"Premier League","England", teamList2()),
            Liga(R.drawable.spain_flag,"La Liga","Spain", teamList()),
            Liga(R.drawable.englangd_flag,"Premier League","England", teamList2()),
            )
    }
    fun teamList(): MutableList<Team>{
        return mutableListOf(
            Team(R.drawable.atletic,"Atletica Madrid","2","1","6","23","3"),
            Team(R.drawable.real_madrid,"Real Madrid","4","3","7","15","37"),
            Team(R.drawable.barca,"Barcelona","4","4","9","20","34"),
            Team(R.drawable.villareal,"VillaReal","8","2","10","16","32"),
        )
    }
    fun teamList2(): MutableList<Team>{
        return mutableListOf(
            Team(R.drawable.liver_pool,"Liverpool","4","4","9","20","34"),
            Team(R.drawable.manchester,"Man United","2","1","6","23","38"),
            Team(R.drawable.leicester,"Leicester City","2","1","6","23","3"),
            Team(R.drawable.villareal,"VillaReal","10","3","7","4","52"),
        )
    }
}