package cl.gencina.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import cl.gencina.fastfood.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(v -> {
            Intent goTo = new Intent(this, MainActivity.class);
            startActivity(goTo);
        });

        binding.btnMap.setOnClickListener(v -> {
            Intent goTo = new Intent(this, MapActivity.class);
            startActivity(goTo);
        });

        createMenuList();
    }

    private void createMenuList() {
        List<String> listaMenu = new ArrayList();

        listaMenu.add("Puré de calabacín");
        listaMenu.add("Tortilla de patatas");
        listaMenu.add("Albóndigas de pollo");
        listaMenu.add("Ensalada de tomate");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Lentejas vegetales");
        listaMenu.add("Croquetas de atún");
        listaMenu.add("Menestra de verduras");
        listaMenu.add("Sardinas al horno");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Macarrones con verduras");
        listaMenu.add("Pollo a la cerveza");
        listaMenu.add("Sopa juliana");
        listaMenu.add("Corvina al ajillo");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Pisto de verduras");
        listaMenu.add("Marmitako de salmón");
        listaMenu.add("Conejo guisado");
        listaMenu.add("Berenjenas rellenas	Guisantes con jamón");
        listaMenu.add("Pizza casera");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,listaMenu);
        binding.lvMenu.setAdapter(adapter);

    }
}