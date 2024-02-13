package com.axtemka.recyclerviewandarrayadapter;

import androidx.recyclerview.widget.RecyclerView;

import com.axtemka.recyclerviewandarrayadapter.databinding.AdapterItemPetBinding;

import java.util.Objects;

public class PetViewHolder extends RecyclerView.ViewHolder {

    AdapterItemPetBinding binding;

    public PetViewHolder(AdapterItemPetBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Pet pet){
        if (Objects.equals(pet.getName(), "Pudge")) binding.imageView.setImageResource(R.drawable.img);
        if (Objects.equals(pet.getName(), "Invoker")) binding.imageView.setImageResource(R.drawable.img_1);
        if (Objects.equals(pet.getName(), "Fiend")) binding.imageView.setImageResource(R.drawable.img_2);
        if (Objects.equals(pet.getName(), "CM")) binding.imageView.setImageResource(R.drawable.img_3);
        binding.breedTextView.setText(pet.getBreed());
        binding.nameTextView.setText(pet.getName());
    }
}
