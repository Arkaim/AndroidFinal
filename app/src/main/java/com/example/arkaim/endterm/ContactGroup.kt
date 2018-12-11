package com.example.arkaim.endterm

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcel
import android.os.Parcelable

@Entity (tableName = "contact_group")
data class ContactGroup(@PrimaryKey
                            var id: Int,
                            var name: String,
                            var priority: String) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readInt(),
                parcel.readString(),
                parcel.readString()) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(id)
            parcel.writeString(name)
            parcel.writeString(priority)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<ContactGroup> {
            override fun createFromParcel(parcel: Parcel): ContactGroup {
                return ContactGroup(parcel)
            }

            override fun newArray(size: Int): Array<ContactGroup?> {
                return arrayOfNulls(size)
            }
        }
    }
}