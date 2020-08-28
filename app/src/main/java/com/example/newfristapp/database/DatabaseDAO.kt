package com.example.newfristapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDAO {
    @Insert
    fun insert(contact: Mycontact)
    @Query("SELECT * from mycontact_table")
    fun get(): LiveData<List<Mycontact>>
}