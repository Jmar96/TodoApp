package ph.jproyekto.todoapp

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import ph.jproyekto.todoapp.db.TodoDatabase

class MainApplication : Application() {

    companion object{
        lateinit var todoDatabase: TodoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        Room.databaseBuilder(
            applicationContext,
            TodoDatabase::class.java,
            TodoDatabase.NAME

        ).build()
    }
}