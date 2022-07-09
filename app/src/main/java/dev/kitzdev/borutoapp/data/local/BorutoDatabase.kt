package dev.kitzdev.borutoapp.data.local

import androidx.room.Database
import dev.kitzdev.borutoapp.data.local.dao.HeroDao
import dev.kitzdev.borutoapp.domain.modal.Hero

@Database(entities = [Hero::class], version = 1)
abstract class BorutoDatabase {
    abstract fun heroDao(): HeroDao
}