package com.example.apprendendo;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.messenger.R;

import java.util.ArrayList;
import java.util.List;

public class DialogActivity  extends AppCompatActivity
{
    int pos = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button iniciar = (Button) findViewById(R.id.btnIniciar);
        iniciar.setText("Assistente flutuante");
        TextView msg = (TextView) findViewById(R.id.txtMensagem);
        msg.setText("Agora que já apprendeu a usar, pode voltar para o aplicativo.");

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(DialogActivity.this, FloatingViewService.class));
            }
        });
        abrirDialog();
        List<Drawable> imagens = new ArrayList<>();

    }
    public void abrirDialog()
    {
        final Dialog dialog = new Dialog(DialogActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_layout);
        dialog.setTitle("Como usar esse aplicativo:");



        dialog.show();

    }
}
