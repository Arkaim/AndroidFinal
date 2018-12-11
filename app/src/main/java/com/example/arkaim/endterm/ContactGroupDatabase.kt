package com.example.arkaim.endterm

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import android.text.Selection

@Database(entities = arrayOf(Selection::class), version = 1)

abstract class ContactGroupDatabase : RoomDatabase() {
    abstract fun contactsDao() : ContactsDAO

    companion object {
        private var INSTANCE: ContactGroupDatabase? = null
        fun getInstance(context: Context) : ContactGroupDatabase? {
            if (INSTANCE == null) {
                synchronized(ContactGroupDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, ContactGroupDatabase::class.java, "contact_group.db").build()
                }
            }
            return INSTANCE
        }
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}
