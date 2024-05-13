package com.kirakn.a48;


public class Plant {

    // поля сущности
    private String name; // название растения
    private String plantDescription; // описание растения
    private int plantResource; // ресурс растения (иллюстрация)

    // конструктор
    public Plant(String name, String plantDescription, int plantResource) {
        this.name = name;
        this.plantDescription = plantDescription;
        this.plantResource = plantResource;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlantDescription() {
        return plantDescription;
    }

    public void setPlantDescription(String plantDescription) {
        this.plantDescription = plantDescription;
    }

    public int getPlantResource() {
        return plantResource;
    }

    public void setPlantResource(int plantResource) {
        this.plantResource = plantResource;
    }
}
