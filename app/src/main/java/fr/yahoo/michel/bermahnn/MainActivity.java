package fr.yahoo.michel.bermahnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonToast;
    private Button buttonInc;
    private TextView textViewCount;
    private int counter = 0;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        buttonToast = findViewById(R.id.toast);
        buttonInc = findViewById(R.id.bouton_increment);
        textViewCount = findViewById(R.id.text_view);


// Intercept click on the compute button
        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //incrémenter la valeur du compteur puis mettre à jour le text
                counter++;
                textViewCount.setText("" + counter);
            }

        });
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pour afficher un toast
                Toast.makeText(MainActivity.this, counter + " Click", Toast.LENGTH_SHORT).show();
            }
        });


    }

}