package id.ac.poliban.dts.agilputradesalwa.latihan08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null) getSupportActionBar().setTitle("MainActivity");

        Button btExplicit = findViewById(R.id.btExplicit);
        Button btImplicit = findViewById(R.id.btImplicit);

        btExplicit.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivitySecond.class);
            startActivity(intent);
        });
         btImplicit.setOnClickListener(v -> {
             Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AgilPutraDesalwa"));
             startActivity(intent);
         });
    }
}
