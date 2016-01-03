package br.com.mackezie.projetounesp_for_android.view;

import android.annotation.TargetApi;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import br.com.mackezie.projetounesp_for_android.R;
import br.com.mackezie.projetounesp_for_android.dao.faeDao;

import br.com.mackezie.projetounesp_for_android.modelo.Valores;

public class FAEActivity extends AppCompatActivity {

    SQLiteDatabase bancoDados; //Pacote do BD

    Spinner spnOrgaos;

    Button btnConsultar;
    EditText txtEnergia, txtFAE;

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

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        abreouCriaBanco();//chamando banco de dados



        setContentView(R.layout.activity_fae);

        spnOrgaos = (Spinner) findViewById(R.id.spnOrgaos);//Spinner
        btnConsultar = (Button) findViewById(R.id.btnConsultar);//Button
        txtEnergia = (EditText) findViewById(R.id.txtEnergia);//EditText
        txtFAE = (EditText) findViewById(R.id.txtFAE);//EditText

        ArrayAdapter<String> adpOrgaos = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);
        adpOrgaos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adpOrgaos.addAll(names);
        spnOrgaos.setAdapter(adpOrgaos);


        //tras retorno do banco
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valores valores = new Valores();
                int valor = Integer.parseInt(txtEnergia.getText().toString());
                String orgao = spnOrgaos.getSelectedItem().toString();

                //bancoDados.execSQL("insert into Adrenais (valores) values ('"+DataBase.InserindoAdrenais(num)+"')");

                //Toast.makeText(FAEActivity.this, ""+num+"", Toast.LENGTH_SHORT).show();
                faeDao.Consultar(txtEnergia, txtFAE, orgao, bancoDados, FAEActivity.this,valores);


                faeDao.Consultar(txtEnergia, txtFAE, orgao, bancoDados, FAEActivity.this,valores);
                txtFAE.setText(valores.getValores());



            }
        });
    }

    public void abreouCriaBanco(){
        try {

            //cria ou abre o Banco de dados
            bancoDados = openOrCreateDatabase("projetounesp",MODE_PRIVATE, null);


            bancoDados.execSQL("drop table if exists Adrenais");
            bancoDados.execSQL("drop table if exists Baco");

            bancoDados.execSQL("create table if not exists Adrenais(codigo_valores integer primary key autoincrement," +
                    "valores text)");

            bancoDados.execSQL("create table if not exists Baco(codigo_valores integer primary key autoincrement," +
                    "valores text)");


            //String[] valores = {"0.00E+00","1.00E+00","2.00E+00","3.00E+00","4.00E+00"};


            int i;
            for(i=0;i<60;i++){
                //bancoDados.execSQL("insert into Adrenais (valores) values ('"+String.valueOf(valores[i])+"')");
                bancoDados.execSQL("insert into Adrenais (valores) values ('"+ faeDao.InserindoAdrenais(i)+"')");
                bancoDados.execSQL("insert into Baco (valores) values ('"+ faeDao.InserindoAdrenais(i)+"')");
            }


            Toast.makeText(FAEActivity.this, "Banco criado com sucesso", Toast.LENGTH_SHORT).show();


        } catch (Exception e) {
            Toast.makeText(FAEActivity.this, "Erro", Toast.LENGTH_SHORT).show();
        }
    }
}

