package com.kotonosora.dailytools.ui.inventory

import android.app.Application
import com.kotonosora.dailytools.data.inventory.ItemRoomDatabase

class InventoryApplication : Application(){
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}