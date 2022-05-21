package com.kotonosora.dailytools.ui.busschedule

import android.app.Application
import com.kotonosora.dailytools.database.AppDatabase

class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}