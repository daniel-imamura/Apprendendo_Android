package com.example.apprendendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.messenger.R;

public class MainActivity extends AppCompatActivity {
    private boolean funcionando = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(funcionando)
            System.out.println("FUNCIONANDO");
        if(!funcionando) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button iniciar = (Button) findViewById(R.id.btnIniciar);
            iniciar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startService(new Intent(MainActivity.this, FloatingViewService.class));
                    funcionando = true;
                    //abrirDialog();
                }
            });
        }
    }
}