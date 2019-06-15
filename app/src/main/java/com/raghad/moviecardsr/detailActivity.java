package com.raghad.moviecardsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class detailActivity extends AppCompatActivity {
    private ImageView poster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        poster = (ImageView)findViewById(R.id.imageView);
     MovieAlbum details = (MovieAlbum) getIntent().getExtras().getSerializable("image");
    }
}
