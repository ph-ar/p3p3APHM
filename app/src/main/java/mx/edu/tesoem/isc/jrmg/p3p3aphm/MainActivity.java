package mx.edu.tesoem.isc.jrmg.p3p3aphm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gvDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvDatos = findViewById(R.id.gvDatos);
        String[] arreglo = new String[]{
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8",
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8",
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8",
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8",
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8",
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8",
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8",
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8",
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8",
                "Num5Num5Num5Num5Num5","Num5Num5Num5Num5Num6","Num7Num5Num5Num5Num5","Num5Num5Num5Num5Num8"

        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arreglo);
        gvDatos.setAdapter(adapter);
    }
}

