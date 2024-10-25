package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch Pixel 2", description = "An android Watch"),
        Wish(title = "Samsung Software Academy For Youth", description = "Please Take me"),
        Wish(title = "What can I do for success?", description = "Just Study hard. bro"),
    )
}
