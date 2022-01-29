package com.example.affirmations.model;

public class Affirmation {
    public int textResourcedId;
    public int picResourcedId;
    public Affirmation (int resId, int picId) {
        textResourcedId = resId;
        picResourcedId = picId;
    }
}
