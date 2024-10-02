package ph.jproyekto.todoapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun TodoListPage() {
    val todoList = getFakeTodo();

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        LazyColumn(content = {
            itemsIndexed(todoList){
                index: Int, item: Todo -> TodoItem(item = item)
            }

        })
    }

}

@Composable
fun TodoItem(item:Todo) {
    Row{
        Column {
            Text(text = SimpleDateFormat("yyyy-mm-dd HH:mm", Locale.ENGLISH).format(item.createdAt))
            Text(text = item.title)
        }

    }
}