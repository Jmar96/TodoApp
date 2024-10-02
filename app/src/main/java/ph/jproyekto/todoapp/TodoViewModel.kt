package ph.jproyekto.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.Instant
import java.util.Date

class TodoViewModel : ViewModel() {
//    private var _todoList = MutableLiveData<List<Todo>>()
//    val todoList : LiveData<List<Todo>> = _todoList

    val todoDao = MainApplication.todoDatabase.getTodoDao()
    val todoList : LiveData<List<Todo>> = todoDao.getAllTodo()

//    fun getAllTodo(){
//        _todoList.value = TodoManager.getAllTodo().reversed()
//    }
    fun addTodo(title: String){
//        TodoManager.addTodo(title)
//        getAllTodo()
        todoDao.addTodo(Todo(title = title, createdAt = Date.from(Instant.now())))
    }
    fun deleteTodo(id: Int){
//        TodoManager.deleteTodo(id)
//        getAllTodo()
        todoDao.deleteTodo(id)
    }
}