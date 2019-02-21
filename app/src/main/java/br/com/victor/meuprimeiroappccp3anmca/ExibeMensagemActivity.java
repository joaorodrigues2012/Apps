package br.com.victor.meuprimeiroappccp3anmca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExibeMensagemActivity extends AppCompatActivity {

    private TextView txtExibeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);

        txtExibeMsg = findViewById(R.id.txtExibeMsg);

        Intent origemIt = getIntent();
        String msg = origemIt.getStringExtra(MainActivity.CHAVE_MSG);
        txtExibeMsg.setText(msg);
    }
}
