package com.example.arkaim.endterm

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface ContactsDAO {
    @Query("SELECT * FROM contacts")
    fun getAll() : List<Contact>

    @Insert
    fun insert (contact: Contact)

}