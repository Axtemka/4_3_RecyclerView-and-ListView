package com.axtemka.recyclerviewandarrayadapter;

import java.io.Serializable;

public class Pet implements Serializable {
    private String name;
    private String imgUrl;
    private String breed;

    public Pet(String name, String imgUrl, String breed) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
