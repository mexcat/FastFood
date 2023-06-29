package cl.gencina.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

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
        //ArrayList listaMenu = new ArrayList();

        String listaMenu[]
                = {  "Puré de calabacín" ,"Tortilla de patatas","Albóndigas de pollo","Ensalada de tomate","Leche, pan con aceite y fruta","Lentejas vegetales","Croquetas de atún"};


       /* listaMenu.add("Puré de calabacín");
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

        ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(),binding.lvMenu,R.id.textView,listaMenu);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(
                this,
                binding.lvMenu,
                listaMenu);

        binding.lvMenu.setAdapter(listaMenu,);*/
    }
}