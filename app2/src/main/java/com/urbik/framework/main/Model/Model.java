package com.urbik.framework.main.Model;


/**
 * Created by Antoine on 17/09/2014.
 */
public abstract class Model {
    protected Enum<?> name;
    protected float scale;
    protected String pathOfModel;

    public Enum<?> getName() {
        return name;
    }

    public void setName(Enum<?> name) {
        this.name = name;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public String getPathOfModel() {
        return pathOfModel;
    }

    public void setPathOfModel(String pathOfModel) {
        this.pathOfModel = pathOfModel;
    }
}
