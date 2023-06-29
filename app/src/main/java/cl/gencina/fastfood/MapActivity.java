package cl.gencina.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.gencina.fastfood.databinding.ActivityMapBinding;

public class MapActivity extends AppCompatActivity {
    private ActivityMapBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());       }
}