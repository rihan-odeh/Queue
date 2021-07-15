package com.example.queue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText output;
    Array_Queue array_queue;
    LinkedListQueue linkedListQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        output = findViewById(R.id.editText);
     /*   array_queue =new Array_Queue();
        array_queue.enqueue(5);
        array_queue.enqueue(9);
        array_queue.enqueue(8);
        array_queue.enqueue(3);
        array_queue.enqueue(4);
        Log.e("", String.valueOf(array_queue.dequeue()));
      //  array_queue.dequeue();
        output.setText((array_queue.printArray()));*/
        linkedListQueue= new LinkedListQueue();
        linkedListQueue.enqueue(2);
        linkedListQueue.enqueue(3);
        linkedListQueue.enqueue(6);
        linkedListQueue.enqueue(7);

        output.setText(String.valueOf(linkedListQueue.dequeue()));
        Log.e("####", String.valueOf(linkedListQueue.getFront()));





    }
}