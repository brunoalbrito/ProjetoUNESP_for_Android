package br.com.mackezie.projetounesp_for_android.dao;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.Toast;
import br.com.mackezie.projetounesp_for_android.modelo.Valores;

import java.sql.SQLException;

/**
 * Created by Bruno on 02/01/2016.
 */
public class faeDao {
    public static String InserindoAdrenais(int index){
        String orgaos[] = {"0.00E+00","0.00E+00","0.00E+00","0.00E+00",
                "0.00E+00","0.00E+00","0.00E+00","0.00E+00","0.00E+00","0.00E+00","0.00E+00",
                "0.00E+00","0.00E+00","0.00E+00","0.00E+00","0.00E+00","0.00E+00","4.58E-06","0.00E+00",
                "0.00E+00",
                "5.98E-04",
                "4.13E-07",
                "2.24E-04",
                "0.00E+00",
                "1.05E-04",
                "3.57E-05",
                "1.99E-03",
                "1.97E-03",
                "1.50E-04",
                "1.56E-03",
                "3.55E-06",
                "1.56E-03",
                "1.39E-03",
                "1.86E-03",
                "1.21E-03",
                "1.20E-03",
                "1.76E-03",
                "1.90E-03",
                "2.41E-03",
                "8.45E-04",
                "1.70E-03",
                "1.42E-03",
                "3.15E-03",
                "3.12E-03",
                "6.03E-03",
                "3.66E-03",
                "1.53E-03",
                "9.11E-04",
                "4.15E-03",
                "5.64E-03",
                "2.59E-03",
                "3.47E-03",
                "2.39E-03",
                "3.40E-03",
                "3.82E-03",
                "3.41E-03",
                "4.41E-03",
                "3.16E-03",
                "3.83E-03",
                "4.35E-03",
                "4.10E-03",
                "2.49E-03",
                "2.60E-03",
                "1.79E-03",
                "2.58E-03",
                "2.42E-03",
                "1.08E-03",
                "7.47E-04",
                "2.58E-03",
                "1.52E-03",
                "2.81E-03",
                "1.09E-03",
                "2.24E-03",
                "3.28E-03",
                "1.40E-03",
                "1.63E-03",
                "3.10E-03",
                "1.71E-03",
                "2.22E-03",
                "2.14E-03",
                "2.09E-03",
                "1.54E-03",
                "3.36E-03",
                "3.37E-03",
                "3.34E-03",
                "5.45E-03",
                "3.24E-03",
                "2.68E-03",
                "2.86E-03",
                "3.20E-03",
                "2.82E-03",
                "2.52E-03",
                "1.65E-03",
                "1.57E-03",
                "2.84E-03",
                "2.07E-03",
                "2.37E-03",
                "1.92E-03",
                "2.36E-03",
                "2.82E-03",
                "3.64E-03",
                "4.17E-03",
                "4.06E-03",
                "4.10E-03",
                "3.73E-03",
                "3.22E-03",
                "3.51E-03",
                "3.00E-03",
                "3.58E-03",
                "2.53E-03",
                "2.99E-03",
                "3.10E-03",
                "3.09E-03",
                "3.00E-03",
                "3.10E-03",
                "2.37E-03",
                "3.60E-03",
                "3.62E-03",
                "3.75E-03",
                "4.68E-03",
                "4.26E-03",
                "4.94E-03",
                "5.05E-03",
                "2.90E-03",
                "2.11E-03",
                "1.75E-03",
                "2.07E-03",
                "3.25E-03",
                "1.68E-03",
                "2.04E-03",
                "2.31E-03",
                "2.44E-03",
                "2.24E-03",
                "2.88E-03",
                "2.52E-03",
                "3.50E-03",
                "4.18E-03",
                "4.65E-03",
                "3.48E-03",
                "3.65E-03",
                "3.49E-03",
                "3.42E-03",
                "3.25E-03",
                "4.09E-03",
                "4.60E-03",
                "3.54E-03",
                "2.47E-03",
                "2.65E-03",
                "2.07E-03",
                "1.84E-03",
                "1.29E-03",
                "2.08E-03",
                "3.73E-03",
                "4.08E-03",
                "4.68E-03",
                "4.48E-03",
                "4.08E-03",
                "4.65E-03",
                "4.77E-03",
                "4.07E-03",
                "3.36E-03",
                "2.07E-03",
                "2.60E-03",
                "2.32E-03",
                "1.50E-03",
                "2.76E-03",
                "2.69E-03",
                "2.12E-03",
                "2.80E-03",
                "2.02E-03",
                "2.78E-03",
                "2.79E-03",
                "2.22E-03",
                "1.21E-03",
                "3.52E-03",
                "3.50E-03",
                "5.04E-03",
                "3.46E-03",
                "3.93E-03",
                "3.39E-03",
                "4.54E-03",
                "4.32E-03",
                "5.25E-03",
                "5.32E-03",
                "3.22E-03",
                "2.76E-03",
                "3.26E-03",
                "2.76E-03",
                "2.33E-03",
                "1.90E-03",
                "2.15E-03",
                "3.12E-03",
                "3.04E-03",
                "3.71E-03",
                "3.96E-03",
                "2.24E-03",
                "2.44E-03",
                "2.45E-03",
                "3.02E-03",
                "3.57E-03",
                "3.53E-03",
                "3.79E-03",
                "2.65E-03",
                "2.62E-03",
                "3.16E-03",
                "2.84E-03",
                "3.04E-03",
                "3.41E-03",
                "2.28E-03",
                "2.16E-03",
                "3.73E-03",
                "2.46E-03",
                "2.94E-03",
                "2.58E-03",
                "2.38E-03",
                "2.84E-03",
                "2.66E-03",
                "3.04E-03",
                "1.98E-03",
                "2.43E-03",
                "2.77E-03",
                "2.92E-03",
                "1.73E-03",
                "1.99E-03",
                "1.22E-03",
                "1.37E-03",
                "1.80E-03",
                "1.88E-03",
                "2.10E-03",
                "2.10E-03",
                "2.10E-03",
                "2.01E-03",
                "1.76E-03",
                "2.25E-03",
                "2.79E-03",
                "3.73E-03",
                "3.49E-03",
                "4.14E-03",
                "3.24E-03",
                "2.42E-03"};


        return orgaos[index];
    }
    public static void Consultar(EditText txtEnergia,EditText txtFAE,String orgao,SQLiteDatabase bancoDatos,Activity activity,Valores valores){
        try {
            String sql = "select * from "+orgao+" where codigo_valores = "+txtEnergia.getText().toString()+" ";

            Cursor cursor  = bancoDatos.rawQuery(sql,null);




            if(cursor!=null){
                cursor.moveToFirst();
                valores.setValores(cursor.getString(cursor.getColumnIndex("valores")));
                //String fae = (cursor.getString(cursor.getColumnIndex("valores")));
                //txtFAE.setText(fae);
            }


        }catch(Exception e){
            Toast.makeText(activity.getApplication(), "Valores não cadastrados",Toast.LENGTH_SHORT).show();
        }
    }
}
