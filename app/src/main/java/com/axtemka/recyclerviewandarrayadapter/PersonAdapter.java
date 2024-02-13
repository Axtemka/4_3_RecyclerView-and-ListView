package com.axtemka.recyclerviewandarrayadapter;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class PersonAdapter extends ArrayAdapter<Person> {


    public PersonAdapter(@NonNull Context context, Person[] persons) {
        super(context, R.layout.adapter_item, persons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item, null);
        }

        ((TextView) convertView.findViewById(R.id.textView1)).setText(String.valueOf(person.getId()));
        ((TextView) convertView.findViewById(R.id.textView2)).setText(person.getName());
        ((TextView) convertView.findViewById(R.id.textView3)).setText(person.getPhone());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo open recycler view with pets
                //Toast.makeText(getContext(), person.getName(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getContext(), PetViewActivity.class);
                i.putExtra("person", (Serializable) person);
                getContext().startActivity(i);
            }
        });
        return convertView;
    }
}
