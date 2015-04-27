package br.edu.ifba.talkshow.gui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Date;
import java.util.concurrent.ExecutionException;

import br.edu.ifba.talkshow.R;
import br.edu.ifba.talkshow.gui.task.AnuncianteCadTask;
import br.edu.ifba.talkshow.gui.task.UsuarioCadTask;
import br.edu.ifba.talkshow.model.data.Anunciante;


public class talkShow extends ActionBarActivity{

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

    public void cadAnuncianteExec(View view) throws ExecutionException, InterruptedException{

        RadioGroup radioGroup;

        AnuncianteCadTask task = new AnuncianteCadTask();

        String nome = String.valueOf((TextView) findViewById(R.id.nomeAnunc));
        String sobrenome = String.valueOf((TextView) findViewById(R.id.sobrenomeAnunc));
        String endereco = String.valueOf((TextView) findViewById(R.id.enderecoAnunc));
        String cpf = String.valueOf((TextView) findViewById(R.id.cpfAnunc));
        String Data = String.valueOf((TextView) findViewById(R.id.dataAnunc));
        String login = String.valueOf((TextView) findViewById(R.id.loginAnunc));
        String senha = String.valueOf((TextView) findViewById(R.id.senhaAnunc));

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupAnunc);
        radioGroup.clearCheck();

        Bundle savedInstanceState = null;

        onCreate(new Bundle(savedInstanceState)); {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.cadastro_anunciante_talkshow);

         /* Attach CheckedChangeListener to radio group */
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    RadioButton rb = (RadioButton) group.findViewById(checkedId);
                    if(null!=rb && checkedId > -1){
                        String sexo = String.valueOf(rb.getText());
                    }

                }
            });
        }

    }

    public void teste(View view) throws ExecutionException, InterruptedException{


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Create new fragment and transaction
        AnuncianteFragment newFragment = new AnuncianteFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
        transaction.replace(R.id.cadastroAnunciante, newFragment);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();
    }

}


