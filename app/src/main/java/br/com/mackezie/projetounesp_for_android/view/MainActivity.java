package br.com.mackezie.projetounesp_for_android.view;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.mackezie.projetounesp_for_android.R;


public class MainActivity extends AppCompatActivity {

    SQLiteDatabase bancoDados; //Pacote do BD

    Button btnFAE,btnFAIE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnFAE = (Button) findViewById(R.id.btnFAE);
        btnFAIE = (Button) findViewById(R.id.btnFAIE);

        //Insert Navigation Editor --> Tools -> Android...
        findViewById(R.id.btnFAE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FAEActivity.class));
            }
        });
        findViewById(R.id.btnFAIE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FAIEActivity.class));
            }
        });


        /*btnFAE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FAEActivity.class);
                startActivity(intent);
            }
        });*/
    }
}
