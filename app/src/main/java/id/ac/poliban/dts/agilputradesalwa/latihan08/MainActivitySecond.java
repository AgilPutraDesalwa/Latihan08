package id.ac.poliban.dts.agilputradesalwa.latihan08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);

        if (getSupportActionBar()!=null)
            getSupportActionBar().setTitle("MainActivitySecond");
    }
}
