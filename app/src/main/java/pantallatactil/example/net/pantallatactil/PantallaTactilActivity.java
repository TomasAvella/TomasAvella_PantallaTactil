package pantallatactil.example.net.pantallatactil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class PantallaTactilActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_tactil);

        TextView entrada = (TextView)findViewById(R.id.TextViewEntrada);
        entrada.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        TextView salida = (TextView) findViewById(R.id.TextViewSalida);
        salida.append("\n"+"Presion: "+event.getPressure()+"\n"+
                "Tamaño: "+event.getSize()+"\n"+"\n"+
                event.toString()+"\n" );
        return true;
    }
}
