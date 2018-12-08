package com.example.u93.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnUno;
    private Button btnDos;
    private Button btnTres;
    private Button btnCuatro;
    private Button btnCinco;
    private Button btnSeis;
    private Button btnSiete;
    private Button btnOcho;
    private Button btnNueve;
    private Button btnCero;
    private Button btnMenos;
    private Button btnMas;
    private Button btnIgual;
    private Button btnMultiplicar;
    private Button btnDividir;
    private Button btnBorrar;
    private TextView tvResultado;
    private String mostrar = "";
    private String operando1 = "";
    private String operando2 = "";
    private double resultado;
    private String operador = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = findViewById(R.id.btn1);
        btnDos = findViewById(R.id.btn2);
        btnTres = findViewById(R.id.btn3);
        btnCuatro = findViewById(R.id.btn4);
        btnCinco = findViewById(R.id.btn5);
        btnSeis = findViewById(R.id.btn6);
        btnSiete = findViewById(R.id.btn7);
        btnOcho = findViewById(R.id.btn8);
        btnNueve = findViewById(R.id.btn9);
        btnCero = findViewById(R.id.btn0);
        btnMenos = findViewById(R.id.btnMenos);
        btnMas = findViewById(R.id.btnMas);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnIgual = findViewById(R.id.btnIgual);
        tvResultado = findViewById(R.id.tvResultado);

    }

    public void uno(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"1";
        tvResultado.setText(mostrar);
    }

    public void dos(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"2";
        tvResultado.setText(mostrar);
    }

    public void tres(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"3";
        tvResultado.setText(mostrar);
    }

    public void igual(View view) {

        mostrar = tvResultado.getText().toString();
        mostrar = mostrar + "1";
        if(operador.equals("-")){
            resultado = Double.parseDouble(operando1) - Double.parseDouble(tvResultado.getText().toString());
            tvResultado.setText(String.valueOf(resultado));
        }
        if(operador.equals("+")){
            resultado = Double.parseDouble(operando1) + Double.parseDouble(tvResultado.getText().toString());
            tvResultado.setText(String.valueOf(resultado));
        }
        if(operador.equals("/")){
            resultado = Double.parseDouble(operando1) / Double.parseDouble(tvResultado.getText().toString());
            tvResultado.setText(String.valueOf(resultado));
        }
        if(operador.equals("*")){
            resultado = Double.parseDouble(operando1) * Double.parseDouble(tvResultado.getText().toString());
            tvResultado.setText(String.valueOf(resultado));
        }

    }

    public void borrar(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = "";
        tvResultado.setText(mostrar);
        operando1 = "";
        operando2 = "";
    }

    public void seis(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"6";
        tvResultado.setText(mostrar);
    }

    public void cinco(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"5";
        tvResultado.setText(mostrar);
    }

    public void cuatro(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"4";
        tvResultado.setText(mostrar);
    }

    public void nueve(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"9";
        tvResultado.setText(mostrar);
    }

    public void ocho(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"8";
        tvResultado.setText(mostrar);
    }

    public void siete(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"7";
        tvResultado.setText(mostrar);
    }

    public void multiplicar(View view) {
        operando1 = tvResultado.getText().toString();
        operador = "*";
        tvResultado.setText("");
    }

    public void dividir(View view) {
        operando1 = tvResultado.getText().toString();
        operador = "/";
        tvResultado.setText("");
    }

    public void menos(View view) {
        operando1 = tvResultado.getText().toString();
        operador = "-";
        tvResultado.setText("");
    }

    public void mas(View view) {
        operando1 = tvResultado.getText().toString();
        operador = "+";
        tvResultado.setText("");
    }

    public void cero(View view) {
        mostrar = tvResultado.getText().toString();
        mostrar = mostrar+"0";
        tvResultado.setText(mostrar);
    }
}
