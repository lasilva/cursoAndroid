package br.edu.ifba.talkshow.gui;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.edu.ifba.talkshow.R;

public class AnuncianteFragment extends Fragment {

    public static AnuncianteFragment newInstance(String param1, String param2) {
        AnuncianteFragment fragment = new AnuncianteFragment();
        return fragment;
    }

    public AnuncianteFragment() {
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