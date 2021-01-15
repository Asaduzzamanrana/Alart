package com.example.alart;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button exitbutton;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitbutton=findViewById(R.id.exitbuttonid);

        exitbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setTitle(R.string.alerttext);
        alertDialogBuilder.setMessage(R.string.messasetext);
        alertDialogBuilder.setIcon(R.drawable.ques);
        alertDialogBuilder.setCancelable(false);


        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });

        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }
}
