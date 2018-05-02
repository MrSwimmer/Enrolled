package com.zachisleno.data.api.model.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Uni
{
    @SerializedName("numDirs")
    @Expose
    private int numDirs;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("chance")
    @Expose
    private int chance;
    @SerializedName("bestDir")
    @Expose
    private String bestDir;

    public Uni(int numDirs, String name, String image, int chance, String bestDir) {
        this.numDirs = numDirs;
        this.name = name;
        this.image = image;
        this.chance = chance;
        this.bestDir = bestDir;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public int getNumDirs() {
        return numDirs;
    }

    public void setNumDirs(int numDirs) {
        this.numDirs = numDirs;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public String getBestDir ()
    {
        return bestDir;
    }

    public void setBestDir (String bestDir)
    {
        this.bestDir = bestDir;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [numDirs = "+numDirs+", name = "+name+", image = "+image+", chance = "+chance+", bestDir = "+bestDir+"]";
    }
}
