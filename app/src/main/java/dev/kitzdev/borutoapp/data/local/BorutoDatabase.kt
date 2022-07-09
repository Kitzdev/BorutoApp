package dev.kitzdev.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import dev.kitzdev.borutoapp.data.local.dao.HeroDao
import dev.kitzdev.borutoapp.data.local.dao.HeroRemoteKeyDao
import dev.kitzdev.borutoapp.domain.modal.Hero
import dev.kitzdev.borutoapp.domain.modal.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase: RoomDatabase() {
    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao
}