package com.kotonosora.dailytools.viewmodel.busschedule

import androidx.lifecycle.ViewModel
import com.kotonosora.dailytools.database.schedule.Schedule
import com.kotonosora.dailytools.database.schedule.ScheduleDao
import kotlinx.coroutines.flow.Flow

class BusScheduleViewModel(private val scheduleDao: ScheduleDao): ViewModel() {
    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()

    fun scheduleForStopName(name: String): Flow<List<Schedule>> = scheduleDao.getByStopName(name)
}