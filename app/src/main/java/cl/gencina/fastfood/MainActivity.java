package cl.gencina.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import cl.gencina.fastfood.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnStartApp.setOnClickListener(v -> {
            Intent goTo = new Intent(this, MenuActivity.class);
            startActivity(goTo);
        });
    }



}