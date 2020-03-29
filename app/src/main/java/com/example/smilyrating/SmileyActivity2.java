package com.example.smilyrating;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.hsalf.smilerating.SmileyRating;

public class SmileyActivity2 extends AppCompatActivity {

    private SmileyRating mSmileyRating;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smiley_2);
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSmileyRating.setRating(0);
            }
        });

        final TextView status = (TextView) findViewById(R.id.status);

        mSmileyRating = (SmileyRating) findViewById(R.id.smiley);
        mSmileyRating.setSmileySelectedListener(new SmileyRating.OnSmileySelectedListener() {
            @Override
            public void onSmileySelected(SmileyRating.Type type) {
                status.setText(type.toString());
            }
        });
    }
}