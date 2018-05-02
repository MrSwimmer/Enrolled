package com.zachisleno.data.api.model.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dir {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("original")
    @Expose
    private boolean original;
    @SerializedName("chance")
    @Expose
    private int chance;

    public Dir(String name, boolean original, int chance) {
        this.name = name;
        this.original = original;
        this.chance = chance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOriginal() {
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

}
