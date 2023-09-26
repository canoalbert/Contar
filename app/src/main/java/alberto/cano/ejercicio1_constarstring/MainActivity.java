package alberto.cano.ejercicio1_constarstring;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextFrase;
    private Button btnContarCaracter;
    private Button btnContarPalabra;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se inicializan los textos y botones.
        editTextFrase = findViewById(R.id.editTextFrase);
        btnContarCaracter = findViewById(R.id.btnContarCaracter);
        btnContarPalabra = findViewById(R.id.btnContarPalabra);


        btnContarCaracter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String frase = editTextFrase.getText().toString();
                if (frase.isEmpty()){
                    Toast.makeText(MainActivity.this, "El texto esta en blanco", Toast.LENGTH_SHORT).show();
                }else{
                    int numCaracteres = frase.length();
                    Toast.makeText(MainActivity.this, "La frase ceontiene el siguiente número de caracteres" + numCaracteres, Toast.LENGTH_SHORT).show();

                }
            }
        });



        //Eesta es la acción del boton de ContarPalabra
        btnContarPalabra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = editTextFrase.getText().toString();
                if (frase.isEmpty()){
                    Toast.makeText(MainActivity.this, "El texto esta en blanco", Toast.LENGTH_SHORT).show();
                }else {
                    String[] palabras = frase.split("\\s+");
                    int numCaracteres = palabras.length;
                    Toast.makeText(MainActivity.this, "La frase contiene el siguiente número de palabras" + numCaracteres, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}