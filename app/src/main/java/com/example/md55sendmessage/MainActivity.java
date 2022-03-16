package com.example.md55sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final String ALARM_MESSAGE = "Срочно пришлите кота!";

    public void sendMessage(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(this, MessageReceiver.class);
        intent.putExtra("ru.messageact.broadcast.Message", ALARM_MESSAGE);
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        intent.setComponent(componentName);
        sendBroadcast(intent);
    }

}