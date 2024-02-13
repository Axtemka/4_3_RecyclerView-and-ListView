package com.axtemka.recyclerviewandarrayadapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonAdapter adapter = new PersonAdapter(this, createPersons());
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);
    }

    private Person[] createPersons() {

        Pet[] cat_array = new Pet[]{new Pet("Pudge", "https://i.pinimg.com/236x/0f/d6/4e/0fd64e9e0070cc7918e321043b509d26.jpg", "aggressive-cat"),
                                    new Pet("Fiend", "https://i.pinimg.com/236x/e0/57/3c/e0573c58974f17e565b3845562e9bfbd.jpg", "aggressive-cat"),
                                    new Pet("Invoker", "https://i.pinimg.com/236x/08/ac/b8/08acb88e15e5d5f9480f1a18419baaf5.jpg", "skilled-cat"),
                                    new Pet("CM", "https://i.pinimg.com/564x/6b/62/64/6b62640190f7133d1bd3cad45ba41a9b.jpg", "5opka-cat"),
                                    new Pet("Pudge", "https://i.pinimg.com/236x/0f/d6/4e/0fd64e9e0070cc7918e321043b509d26.jpg", "aggressive-cat"),
                                    new Pet("Fiend", "https://i.pinimg.com/236x/e0/57/3c/e0573c58974f17e565b3845562e9bfbd.jpg", "aggressive-cat"),
                                    new Pet("Invoker", "https://i.pinimg.com/236x/08/ac/b8/08acb88e15e5d5f9480f1a18419baaf5.jpg", "skilled-cat"),
                                    new Pet("CM", "https://i.pinimg.com/564x/6b/62/64/6b62640190f7133d1bd3cad45ba41a9b.jpg", "5opka-cat"),
                                    new Pet("Pudge", "https://i.pinimg.com/236x/0f/d6/4e/0fd64e9e0070cc7918e321043b509d26.jpg", "aggressive-cat"),
                                    new Pet("Fiend", "https://i.pinimg.com/236x/e0/57/3c/e0573c58974f17e565b3845562e9bfbd.jpg", "aggressive-cat"),
                                    new Pet("Invoker", "https://i.pinimg.com/236x/08/ac/b8/08acb88e15e5d5f9480f1a18419baaf5.jpg", "skilled-cat"),
                                    new Pet("CM", "https://i.pinimg.com/564x/6b/62/64/6b62640190f7133d1bd3cad45ba41a9b.jpg", "5opka-cat")};

        Person person = new Person(0, "Axtemka", "8-888-888-88-88", Arrays.asList(cat_array));
        Person person1 = new Person(1, "Axtemk", "7-777-777-77-77", Arrays.asList(cat_array));
        Person person2 = new Person(2, "Axtem", "6-666-666-66-66", Arrays.asList(cat_array));
        Person person3 = new Person(3, "Axte", "5-555-555-55-55", Arrays.asList(cat_array));
        Person person4 = new Person(4, "Axt", "4-444-444-44-44", Arrays.asList(cat_array));
        Person person5 = new Person(5, "Ax", "3-333-333-33-33", Arrays.asList(cat_array));
        Person person6 = new Person(6, "AAAAGDESKILLLL", "2-222-222-22-22", Arrays.asList(cat_array));

        return new Person[]{person, person1, person2, person3, person4, person5, person6};
    }
}
