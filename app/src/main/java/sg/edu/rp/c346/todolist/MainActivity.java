package sg.edu.rp.c346.todolist;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDo;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDO);

        alToDo = new ArrayList<>();
        ToDoItem item1 = new ToDoItem("MSA", "1/7/2018");
        ToDoItem item2 = new ToDoItem("Go for haircut", "22/9/2018");
        alToDo.add(item1);
        alToDo.add(item2);

        caToDo = new CustomAdapter(this, R.layout.todo_item, alToDo);

        lvToDo.setAdapter(caToDo);


    }
}
