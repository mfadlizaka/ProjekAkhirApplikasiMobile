package com.example.projekakhirapplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ednama, edtugas, edhadir, edUTS, edUAS, edakhir, edhuruf ;
    Button bhasil ;
    Double vtugas, vhadir, vUTS, vUAS, vakhir ;
    String vnama, vhuruf ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednama = (EditText)findViewById(R.id.ednama);
        edtugas = (EditText)findViewById(R.id.edtugas);
        edhadir = (EditText)findViewById(R.id.edhadir);
        edUTS = (EditText)findViewById(R.id.edUTS);
        edUAS = (EditText)findViewById(R.id.edUAS);
        edakhir = (EditText)findViewById(R.id.edakhir);
        edhuruf = (EditText)findViewById(R.id.edhuruf);
        bhasil = (Button) findViewById(R.id.bhasil);
    }

    public void hasil(View view) {
        vtugas = Double.parseDouble(edtugas.getText().toString());
        vhadir = Double.parseDouble(edhadir.getText().toString());
        vUTS = Double.parseDouble(edUTS.getText().toString());
        vUAS = Double.parseDouble(edUAS.getText().toString());

        vakhir = (0.15 * vhadir) + (0.25 * vtugas) + (0.25 * vUTS) + (0.35 * vUAS);

        if (vakhir >= 90 && vakhir <=100){
            vhuruf="A";
        }
        else if (vakhir >= 80 && vakhir <=89){
            vhuruf="B";
        }
        else if (vakhir >= 70 && vakhir <=79){
            vhuruf="C";
        }
        else if (vakhir >= 60 && vakhir <=69){
            vhuruf="D";
        }
        else {
            vhuruf="E";
        }

        edakhir.setText(""+vakhir);
        edhuruf.setText(""+vhuruf);
    }
}