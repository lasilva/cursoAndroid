package br.edu.ifba.talkshow.gui.task;

import android.os.AsyncTask;

import java.util.Date;

/**
 * Created by lucas on 22/04/15.
 */
public class UsuarioCadTask extends AsyncTask<String, Void, Boolean>{

    @Override
    protected Boolean doInBackground(String... params) {

        String nome = params[0];
        String sobrenome = params[1];
        String sexo = params[2];
        Date dataNascimento = new Date(params[3]);
        String login = params[4];
        String senha = params[5];

        if(login.length() > 5){
            return true;
        }else{
            return false;
        }
    }
}
