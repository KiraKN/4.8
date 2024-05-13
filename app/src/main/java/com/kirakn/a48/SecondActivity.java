package com.kirakn.a48;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Plant
    List<Plant> plants = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // заполнение контейнера plants объектами Plant
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // создадим адаптер и загрузим в него контейнер с данными
        PlantAdapter plantAdapter = new PlantAdapter(this, plants);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(plantAdapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер plants объектов сущности Plant
        plants.add( new Plant("Китайский", "Родной язык: 1 296 461 000 — 1 311 000 000 человек. Основная страна - Китай. Число стран - 39",
                R.drawable.china));
        plants.add( new Plant("Испанский", "Родной язык: 460 000 000 человек. Основная страна - Испания. Число стран - 31",
                R.drawable.esp));
        plants.add( new Plant("Английский", "Родной язык: 379 000 000 человек. Основная страна - Великобритания. Число стран - 137",
                R.drawable.eng));
    }
}