package ph.jproyekto.todoapp.db

import androidx.room.Database
import ph.jproyekto.todoapp.Todo

@Database(entities = [Todo::class], version = 1)
abstract class TodoDatabase {

        companion object{
            const val NAME="Todo_DB"
        }

        abstract fun getTodoDao() : TodoDAO
}