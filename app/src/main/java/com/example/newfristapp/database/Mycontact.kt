package com.example.newfristapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mycontact_table")
data class Mycontact (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    @ColumnInfo(name = "name")
    var name: String = "unnamed",
    @ColumnInfo(name = "phone")
    var phone: String = ""
)