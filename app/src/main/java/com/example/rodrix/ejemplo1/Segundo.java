package com.example.rodrix.ejemplo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by rodrix on 09/04/15.
 */
public class Segundo extends Activity{

    Button btnPrincipal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo);
        btnPrincipal = (Button) findViewById(R.id.btnPrincipal);
    }

    public void onClickVoyPrincipal (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
