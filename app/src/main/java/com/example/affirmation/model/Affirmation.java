package com.example.affirmation.model;

public class Affirmation {
    private final int stringResourceId;
    private final int imageResourceId;

    public Affirmation(int stringResourceId, int imageResourceId) {
        this.stringResourceId = stringResourceId;
        this.imageResourceId = imageResourceId;
    }

    public int getStringResourceId() {
        return this.stringResourceId;
    }
    public int getImageResourceId() {
        return this.imageResourceId;
    }
}
