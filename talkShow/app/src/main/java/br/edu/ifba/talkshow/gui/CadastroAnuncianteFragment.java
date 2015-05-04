package br.edu.ifba.talkshow.gui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.edu.ifba.talkshow.R;

/**
 * Created by lucas on 04/05/15.
 */
public class CadastroAnuncianteFragment  extends Fragment {

    public static CadastroAnuncianteFragment newInstance(String param1, String param2) {
        CadastroAnuncianteFragment fragment = new CadastroAnuncianteFragment();
        return fragment;
    }

    public CadastroAnuncianteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.cadastro_anunciante_talkshow, container, false);
    }
}