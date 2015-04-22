package br.edu.ifba.talkshow.gui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

import br.edu.ifba.talkshow.R;
import br.edu.ifba.talkshow.gui.task.UsuarioCadTask;


public class talkShow extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk_show);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_talk_show, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void metodo(View view) throws ExecutionException, InterruptedException {

        UsuarioCadTask task = new UsuarioCadTask();
        Boolean result = task.execute("Lucas", "Almeida Silva", "M", "11/11/1994", "lasilva", "0904203").get();
        if(result){
            TextView txt = (TextView) findViewById(R.id.txtResult);
            txt.setText("resultado: tem mais que 5 letras");
        }
    }
}
