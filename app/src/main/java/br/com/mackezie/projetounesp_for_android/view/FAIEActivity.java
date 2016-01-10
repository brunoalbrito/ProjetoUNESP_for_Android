package br.com.mackezie.projetounesp_for_android.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import br.com.mackezie.projetounesp_for_android.R;

public class FAIEActivity extends AppCompatActivity {

    Spinner spnOrgaos;
    ListView listView;
    Button btnConsulta;

    String names[] = {"Adrenais",
            "Baco", "Bexiga",
            "Claviculas", "Coração", "Costelas",
            "Escapula", "Espinha", "Estomago", "Figado",
            "G I Intestino Grosso Inferior", " G I Intestino Grosso Superior",
            "Intestino Delgado + Conteudo", "M V Costel", "MACLAVIC", "MACOSTEL", "MAESCAPU",
            "MAESPIINF", "MAESPIME", "MAESPISU", "MAPELVIS", "MVCLAVIC", "MVESCAPU", "MVESPIINFE",
            "MVESPIME", "MVESPISU", "MVPELVIS", "OVARIOS",
            "PANCREAS", "PELETRON", "PELVIS",
            "PULMÕES", "RINS", "TECITRON",
            "TIMO", "TRONCO",
            "UTERO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faie);

        listView = (ListView) findViewById(R.id.lstValues);
        spnOrgaos = (Spinner) findViewById(R.id.spnOrgaos);//Spinner
        btnConsulta = (Button) findViewById(R.id.btnConsulta);

        //SPINNER
        ArrayAdapter<String> adpOrgaos = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,names);
        adpOrgaos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnOrgaos.setAdapter(adpOrgaos);


        //LISTVIEW
        String[] myStringArray={"A","B","C","D","E","F","G","H","I","J","K","M","N","O"};

        ArrayAdapter<String> myAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,myStringArray);
        listView.setAdapter(myAdapter);

        btnConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setVisibility(View.VISIBLE);
            }
        });
    }
}
