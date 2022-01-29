package com.example.affirmations.data;

import com.example.affirmations.R;
import com.example.affirmations.model.Affirmation;

import java.util.List;

public class Datasource {

    public static List<Affirmation> loadAffirmations() {
        return List.of(
                new Affirmation(R.string.affirmation1, R.drawable.pic_one),
                new Affirmation(R.string.affirmation2, R.drawable.pic_two),
                new Affirmation(R.string.affirmation3, R.drawable.pic_three),
                new Affirmation(R.string.affirmation4, R.drawable.pic_four),
                new Affirmation(R.string.affirmation5, R.drawable.pic_five),
                new Affirmation(R.string.affirmation6, R.drawable.pic_six),
                new Affirmation(R.string.affirmation7, R.drawable.pic_seven),
                new Affirmation(R.string.affirmation8, R.drawable.pic_eight),
                new Affirmation(R.string.affirmation9, R.drawable.pic_nine),
                new Affirmation(R.string.affirmation10, R.drawable.pic_ten)
        );
    }
}
