package eu.dominec.septima.lovryb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int penize;
    int lode=0;
    int vyjezd;
    int ryby;

    EditText stavpenez;
    EditText vylovenoryb;
    EditText zisk;
    TextView showValue;


    int getlodnisila() {
        return vyjezd + lode;
    }

    int getstavpenez() {
        return penize + lode * 4 + vyjezd * 2;

    }

    int getpocetryb() {
        return lode + vyjezd;
    }

    int getzisk() {
        return lode * 4 + vyjezd * 2;
    }

    void test() {
        vyjezd = 1;
        penize = 10;
        lode = 2;

    }

    void volba() {
    }

    public void akcelode(View view) {
        lode++;
        penize--;
        penize--;
        penize--;
        penize--;
        showValue.setText(Integer.toString(lode));
        showValue.setText(Integer.toString(penize));

    }

    void hra() {
        stavpenez.setText(Integer.toString(getstavpenez()));
        zisk.setText(Integer.toString(getzisk()));
        vylovenoryb.setText(Integer.toString(getpocetryb()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stavpenez = findViewById(R.id.stavpenez);
        zisk = findViewById(R.id.zisk);
        vylovenoryb = findViewById(R.id.vyloveneryby);
        showValue = (TextView) findViewById(R.id.tlacitkolode);
        hra();
        test();


    }
}
