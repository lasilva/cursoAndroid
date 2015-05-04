package br.edu.ifba.talkshow;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CadLoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CadLoginFragment extends Fragment {

    public static CadLoginFragment newInstance(Bundle args) {
        CadLoginFragment fragment = new CadLoginFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public CadLoginFragment() {
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
        return inflater.inflate(R.layout.fragment_cad_login, container, false);
    }


}
