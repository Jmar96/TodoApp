package ph.jproyekto.todoapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ph.jproyekto.todoapp.Todo

@Dao
interface TodoDAO {

    @Query("SELECT * FROM TODO")
    fun getAllTodo() : LiveData<List<Todo>>

    @Insert
    fun addTodo(todo : Todo)

    @Query("DELETE FROM TODO WHERE id = :id")
    fun deleteTodo(id: Int)


}