package com.example.coralinspiracion;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.example.coralinspiracion.VozCoroActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class VozCoroActivity extends AppCompatActivity {

    private static final String TAG = "VozCoroActivity";
    private TextView nombreCoroTextView;
    private TextView tipoVozTextView;
    private TextView letrasTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voz_coro);

        TextView nombreCoroTextView = findViewById(R.id.nombreCoroTextView);
        TextView tipoVozTextView = findViewById(R.id.tipoVozTextView);
        TextView letrasTextView = findViewById(R.id.letrasTextView);

        letrasTextView.setMovementMethod(new ScrollingMovementMethod());

        String nombreCoro = getIntent().getStringExtra("NOMBRE_CORO");
        String tipoVoz = getIntent().getStringExtra("TIPO_VOZ");
        String letrasVoz = getIntent().getStringExtra("LETRAS_VOZ");

        nombreCoroTextView.setText(nombreCoro);
        tipoVozTextView.setText(tipoVoz);

        if (letrasVoz != null && !letrasVoz.isEmpty()) {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                letrasTextView.setText(Html.fromHtml(letrasVoz, Html.FROM_HTML_MODE_LEGACY));
            } else {
                letrasTextView.setText(Html.fromHtml(letrasVoz));
            }
        } else {
            letrasTextView.setText("Letras no disponibles para esta voz.");
        }

    }
//aqui tambien se modifico
private SpannableString formatearLetrasConResaltado(String letras) {
    SpannableString spannableString = new SpannableString(letras);
    int posicion = 0;
    boolean enResaltado = false;
    int inicioResaltado = 0;

    for (int i = 0; i < letras.length(); i++) {
        if (letras.charAt(i) == '{') {
            if (!enResaltado) {
                inicioResaltado = i - posicion;
                enResaltado = true;
            }
        } else if (letras.charAt(i) == '}') {
            if (enResaltado) {
                spannableString.setSpan(new BackgroundColorSpan(Color.YELLOW),
                        inicioResaltado, i - posicion,
                        Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                enResaltado = false;
            }
        } else if (letras.charAt(i) == '\n') {
            posicion = i + 1;
        }
    }

    return new SpannableString(spannableString.toString().replace("{", "").replace("}", ""));
}
}
