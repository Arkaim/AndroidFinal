package com.example.arkaim.endterm

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query

@Dao
interface ContactGroupDAO {
    @Query("SELECT * FROM contact_group")
    fun getAll(): List<ContactGroup>

}