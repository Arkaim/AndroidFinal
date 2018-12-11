package com.example.arkaim.endterm

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import android.text.Selection

@Database(entities = arrayOf(Selection::class), version = 1)

abstract class ContactDatabase : RoomDatabase() {
    abstract fun contactsDao() : ContactsDAO

    companion object {
        private var INSTANCE: ContactDatabase? = null
        fun getInstance(context: Context) : ContactDatabase? {
            if (INSTANCE == null) {
                synchronized(ContactDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, ContactDatabase::class.java, "contacts.db").build()
                }
            }
            return INSTANCE
        }
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}
