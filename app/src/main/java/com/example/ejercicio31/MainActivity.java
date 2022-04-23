package com.example.ejercicio31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ejercicio31.Configuracion.SQLiteConexion;
import com.example.ejercicio31.Configuracion.bdemple;

public class MainActivity extends AppCompatActivity {
    EditText nombre, apellidos, edad, direccion;
    EditText puesto;
    Button agregar;

    public void listvV(View View){

        Intent verlista = new Intent(this, listv.class);
        startActivity(verlista);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.txtnombre);
        apellidos =(EditText) findViewById(R.id.txtape);
        edad = (EditText) findViewById(R.id.txtedad);
        direccion = (EditText) findViewById(R.id.txtdire);
         puesto = (EditText) findViewById(R.id.txtpuesto);
        agregar = (Button) findViewById(R.id.btnguardar);

    }

    private void AgregarEmpleado() {
        SQLiteConexion conexion=new SQLiteConexion(this, bdemple.NameDatabase, null, 1);
        SQLiteDatabase db =conexion.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(bdemple.nombre, nombre.getText().toString());
        valores.put(bdemple.apellidos, apellidos.getText().toString());
        valores.put(bdemple.edad, edad.getText().toString());
        valores.put(bdemple.puesto, puesto.getText().toString());
        valores.put(bdemple.direccion, direccion.getText().toString());


        Long resultado= db.insert(bdemple.tablaEmple,bdemple.id, valores);
        Toast.makeText(getApplicationContext(),"Ingresado : Codigo : " + resultado.toString(),Toast.LENGTH_LONG).show();
        db.close();
        LimpiarPantalla();

    }

    private void LimpiarPantalla() {
        nombre.setText("");
        apellidos.setText("");
        edad.setText("");
        direccion.setText("");


    }

}
