package alberto.cano.ejercicio1_constarstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextFrase;
    private Button btnContarCaracter;
    private Button btnContarPalabra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContarCaracter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = editTextFrase.getText().toString();
                if (frase.isEmpty()){
                    Toast.makeText(MainActivity.this, "El texto esta en blanco", Toast.LENGTH_SHORT).show();
                }else {

                }
            }
        });

    }
}