package es.pixelpro.david.dia4extraputget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecundarioActivity extends AppCompatActivity {

    //6) Creamos un recurso privado para el nombre
    private String mNombre;
    private String saludoGenerico;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundario);
        
        //7) Nos traemos el intent y el extra
        Intent intent = getIntent();
        mNombre = intent.getStringExtra(getString(R.string.key_name));

        //8) referenciamos el contenedor
        
        TextView mTextView = (TextView) findViewById(R.id.contenidoTextView);


    //9) Le creamos contendio
        saludoGenerico = "Hola %1$s, bienvenido a bordo!";
        //10) Se lo pasamos al contenedor
        String saludoPersonalizado = String.format(saludoGenerico, mNombre);
        mTextView.setText(saludoPersonalizado);

    }
}
