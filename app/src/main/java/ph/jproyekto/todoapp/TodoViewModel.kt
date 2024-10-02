package ph.jproyekto.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {
    private var _todoList = MutableLiveData<List<Todo>>()
    val todoList : LiveData<List<Todo>> = _todoList


    fun getAllTodo() : List<Todo>{

    }
    fun addTodo(){

    }
    fun deleteTodo(){

    }
}