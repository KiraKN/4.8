package com.kirakn.a48;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.ViewHolder>{

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Plant> plants; // поле коллекции контейнера для хранения данных (объектов класса Plant)

    // конструктор адаптера
    public PlantAdapter(Context context, List<Plant> plants) {
        this.inflater = LayoutInflater.from(context);
        this.plants = plants;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Plant
    @Override
    public PlantAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.plant_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Plant по определенной позиции
    @Override
    public void onBindViewHolder(PlantAdapter.ViewHolder holder, int position) {
        Plant plant = plants.get(position);
        holder.plantView.setImageResource(plant.getPlantResource());
        holder.nameView.setText(plant.getName());
        holder.plantDescriptionView.setText(plant.getPlantDescription());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return plants.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView plantView;
        final TextView nameView, plantDescriptionView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление plant_item.xml
        ViewHolder(View view) {
            super(view);
            plantView = view.findViewById(R.id.plantResource);
            nameView = view.findViewById(R.id.name);
            plantDescriptionView = view.findViewById(R.id.plantDescription);
        }
    }
}
