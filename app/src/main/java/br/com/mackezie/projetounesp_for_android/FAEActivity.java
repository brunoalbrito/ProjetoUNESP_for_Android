package br.com.mackezie.projetounesp_for_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FAEActivity extends AppCompatActivity {

    Spinner spnOrgaos;

    String names[] = {"Adrenais",
            "Baco","Bexiga",
            "Claviculas","Coração","Costelas",
            "Escapula","Espinha","Estomago","Figado",
            "G I Intestino Grosso Inferior"," G I Intestino Grosso Superior",
            "Intestino Delgado + Conteudo","M V Costel","MACLAVIC","MACOSTEL","MAESCAPU",
            "MAESPIINF","MAESPIME","MAESPISU","MAPELVIS","MVCLAVIC","MVESCAPU","MVESPIINFE",
            "MVESPIME","MVESPISU","MVPELVIS","OVARIOS",
            "PANCREAS","PELETRON","PELVIS",
            "PULMÕES","RINS","TECITRON",
            "TIMO","TRONCO",
            "UTERO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fae);

        spnOrgaos = (Spinner) findViewById(R.id.spnOrgaos);

        ArrayAdapter<String> adpOrgaos = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
        adpOrgaos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adpOrgaos.addAll(names);
        spnOrgaos.setAdapter(adpOrgaos);



    }
}
