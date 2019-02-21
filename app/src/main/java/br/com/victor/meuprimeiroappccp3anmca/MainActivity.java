package br.com.victor.meuprimeiroappccp3anmca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edCampo;
    private Button btnOk;
    public static final String CHAVE_MSG = "br.usjt.msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edCampo = findViewById(R.id.edCampo);
        btnOk = findViewById(R.id.btnOk);

    }

    public void enviarMensagem(View view) {
        String mensagem = edCampo.getText().toString();
        Intent it = new Intent(this, ExibeMensagemActivity.class);
        it.putExtra(CHAVE_MSG,mensagem);
        startActivityForResult(it,1);
    }
}
