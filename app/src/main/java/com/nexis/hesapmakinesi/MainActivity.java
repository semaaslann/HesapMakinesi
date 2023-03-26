package com.nexis.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button buton0,buton1,buton2,buton3,buton4,buton5,buton6,buton7,buton8,buton9;
    Button butonTopla,butonCıkar,butonCarp,butonBol;
    Button butonEsittir,butonSil;
    EditText islem,sonuc;
    boolean topla,cıkar,carp,bol;
    float sayi1,sayi2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        islem=findViewById(R.id.islem);
        sonuc=findViewById(R.id.sonuc);

        buton0=findViewById(R.id.btn0);
        buton1=findViewById(R.id.btn1);
        buton2=findViewById(R.id.btn2);
        buton3=findViewById(R.id.btn3);
        buton4=findViewById(R.id.btn4);
        buton5=findViewById(R.id.btn5);
        buton6=findViewById(R.id.btn6);
        buton7=findViewById(R.id.btn7);
        buton8=findViewById(R.id.btn8);
        buton9=findViewById(R.id.btn9);
        butonSil=findViewById(R.id.btnSil);
        butonTopla=findViewById(R.id.btnTopla);
        butonCıkar=findViewById(R.id.btnFark);
        butonCarp=findViewById(R.id.btnCarp);
        butonBol=findViewById(R.id.btnBol);
        butonEsittir=findViewById(R.id.btnEsittir);



        buton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"0");
                sonuc.setText(islem.getText());
            }
        });
        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"1");
                sonuc.setText(islem.getText());
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"2");
                sonuc.setText(islem.getText());
            }
        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"3");
                sonuc.setText(islem.getText());
            }
        });
        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"4");
                sonuc.setText(islem.getText());
            }
        });
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"5");
                sonuc.setText(islem.getText());
            }
        });
        buton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"6");
                sonuc.setText(islem.getText());
            }
        });
        buton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"7");
                sonuc.setText(islem.getText());
            }
        });
        buton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"8");
                sonuc.setText(islem.getText());
            }
        });
        buton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"9");
                sonuc.setText(islem.getText());
            }
        });

        butonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText("");
                sonuc.setText("");
            }
        });
        butonTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(islem==null){
                    islem.setText("");
                }
                else {
                    sayi1 = Float.parseFloat(sonuc.getText()+"");
                    topla = true;
                    islem.setText(null);

                }

            }
        });
        butonCıkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Float.parseFloat(sonuc.getText()+"");
                cıkar=true;
                islem.setText(null);

            }
        });
        butonCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Float.parseFloat(sonuc.getText()+"");
                carp=true;
                islem.setText(null);
            }
        });
        butonBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Float.parseFloat(sonuc.getText()+"");
                bol=true;
                islem.setText(null);
            }
        });
        butonEsittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi2=Float.parseFloat(sonuc.getText()+"");
                if(topla==true){
                    sonuc.setText(sayi1+sayi2+"");
                    islem.setText(sayi1+"+"+sayi2);
                    topla=false;
                }
                if(cıkar==true){
                    sonuc.setText(sayi1-sayi2+"");
                    islem.setText(sayi1+"-"+sayi2);
                    cıkar=false;
                }
                if(carp==true){
                    sonuc.setText(sayi1*sayi2+"");
                    islem.setText(sayi1+"*"+sayi2);
                    carp=false;
                }
                if(bol==true){
                    sonuc.setText(sayi1/sayi2+"");
                    islem.setText(sayi1+"/"+sayi2);
                    bol=false;
                }
            }
        });

    }

}