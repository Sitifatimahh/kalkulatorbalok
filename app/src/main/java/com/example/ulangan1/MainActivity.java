package com.example.ulangan1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import  java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText etPanjang, etLebar, etTinggi;
    private double p, l, t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
    }

    private void data(List<String> Variabel) {

        String panjang = etPanjang.getText().toString();
        String lebar = etLebar.getText().toString();
        String tinggi = etTinggi.getText().toString();
        p = Double.parseDouble(panjang);
        l = Double.parseDouble(lebar);
        t = Double.parseDouble(tinggi);


    }

    public void hitung_volume(View view) {
        List<String> variabel = new ArrayList<>();
        data(variabel);
        Double volume = p * l * t;
        Intent intent = new Intent(this, Main3Activity.class);
        String name;
        intent.putExtra("data", String.valueOf(volume));
        startActivity(intent);
    }

    public void hitung_keliling(View view){
        List<String> variabel = new ArrayList<>();
        data(variabel);
        Double keliling = 4 * (p + l + t);
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("data", String.valueOf(keliling));
        startActivity(intent);

    }

    public void hitung_luas(View view){
        List<String> variabel = new ArrayList<>();
        data(variabel);
        Double luas = 4 * (p + l + t);
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("data", String.valueOf(luas));
        startActivity(intent);

    }
}

