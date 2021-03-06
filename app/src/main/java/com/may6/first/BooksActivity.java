package com.may6.first;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BooksActivity extends Activity {
    ListView listBooks;
    ArrayList<String> books = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        listBooks = (ListView) findViewById(R.id.LvBooks);

        // bind listview with books

        books.add("Android in Action");
        books.add("Java Complete  Ref");
        books.add("Learn Android");
        books.add("Spring in Action");

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_single_choice,
                        books);

        listBooks.setAdapter(adapter);


    }

}
