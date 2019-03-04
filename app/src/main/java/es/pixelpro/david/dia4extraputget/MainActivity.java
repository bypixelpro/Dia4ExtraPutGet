package es.pixelpro.david.dia4extraputget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   // 1) Creamos un campo para poner el nombre y un boton

    private EditText mCampoNombre;
    private Button mBotonInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2) referenciamos cada elemnto
        mCampoNombre = (EditText)findViewById(R.id.nombreEditText);
        mBotonInicio = (Button)findViewById(R.id.inicioButton);

        //3) Creamos un onclick que obtiene el texto y lo pasamos por parametro al metodo 4)
        mBotonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = mCampoNombre.getText().toString();
                startStory(nombre);
            }
        });
    }

    //4) Creamos un metodo y con PUTEXTRA y le pasamos el nombre que hemos recibido
    private void startStory(String nombre) {
        Intent intent = new Intent(MainActivity.this, SecundarioActivity.class);
        intent.putExtra(getString(R.string.key_name), nombre);
        //5) Iniciamos el segundo activity
        startActivity(intent);
    }

}