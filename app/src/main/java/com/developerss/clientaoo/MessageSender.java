package com.developerss.clientaoo;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageSender extends AsyncTask<String, Void, Void> {

    private Socket s;
    private PrintWriter pw;

    @Override
    protected Void doInBackground(String... strings) {

        String  msg = strings[0];
        try{
            s = new Socket("192.168.0.101", 6666);

            pw = new PrintWriter(s.getOutputStream());
            pw.write(msg);
            pw.flush();
            pw.close();
            s.close();

        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
