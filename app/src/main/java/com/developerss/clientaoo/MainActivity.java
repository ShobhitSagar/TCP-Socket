package com.developerss.clientaoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.et_msg);

    }

    public void send(View view) {
        MessageSender messageSender = new MessageSender();
        messageSender.execute(et.getText().toString());
        toast("Message Sent!");
    }

    public void toast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
