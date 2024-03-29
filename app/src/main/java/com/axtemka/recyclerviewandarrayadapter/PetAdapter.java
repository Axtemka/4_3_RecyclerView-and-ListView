package com.axtemka.recyclerviewandarrayadapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.axtemka.recyclerviewandarrayadapter.databinding.AdapterItemPetBinding;

import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetViewHolder> {

    private List<Pet> pets;

    public PetAdapter(List<Pet> pets) {
        this.pets = pets;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AdapterItemPetBinding binding = AdapterItemPetBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new PetViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        holder.bind(pets.get(position));
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

}
