package com.axtemka.recyclerviewandarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.axtemka.recyclerviewandarrayadapter.databinding.ActivityPetViewBinding;

public class PetViewActivity extends AppCompatActivity {
    private ActivityPetViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPetViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent person_intent = getIntent();
        Person person = (Person) person_intent.getSerializableExtra("person");

        PetAdapter adapter = new PetAdapter(person.getPets());
        binding.petRecyclerView.setAdapter(adapter);
    }
}