package dev.kitzdev.borutoapp.domain.modal

import androidx.room.Entity
import androidx.room.PrimaryKey
import dev.kitzdev.borutoapp.util.Constants.HERO_REMOTE_KEY_DATABASE_TABLE

@Entity(tableName = HERO_REMOTE_KEY_DATABASE_TABLE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val previousPage: Int?,
    val nextPage: Int?,
)
