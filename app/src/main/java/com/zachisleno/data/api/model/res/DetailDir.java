package com.zachisleno.data.api.model.res;

public class DetailDir {
    String name;
    String des;
    String chance;
    String doc;
    String comp;
    String places;
    String pos;
    String posOrig;
    int color;

    public DetailDir(String name, String des, String chance, String doc, String comp, String places, String pos, String posOrig, int color) {
        this.name = name;
        this.des = des;
        this.chance = chance;
        this.doc = doc;
        this.comp = comp;
        this.places = places;
        this.pos = pos;
        this.posOrig = posOrig;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getChance() {
        return chance;
    }

    public void setChance(String chance) {
        this.chance = chance;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getPosOrig() {
        return posOrig;
    }

    public void setPosOrig(String posOrig) {
        this.posOrig = posOrig;
    }
}
