package org.omnirom.omnimost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateMessage message = new CreateMessage();
    }



}
