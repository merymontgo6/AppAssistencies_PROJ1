package com.example.prjassistencies;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link s_e_prof#newInstance} factory method to
 * create an instance of this fragment.
 */
public class s_e_prof extends Fragment {
    private ImageButton homeBoto;
    private ImageButton mssgBoto;
    private ImageButton userBoto;
    private ImageButton horariBoto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_s_e_prof, container, false); // Infla el layout del fragmento

        homeBoto = view.findViewById(R.id.homeBoto); // Asociamos el botón
        mssgBoto = view.findViewById(R.id.mssgBoto);
        userBoto = view.findViewById(R.id.userBoto);
        horariBoto = view.findViewById(R.id.horariBoto);

        homeBoto.setOnClickListener(new View.OnClickListener() { // Configuramos el listener para el clic
            @Override
            public void onClick(View v) {
                // Creamos un Intent para abrir la actividad principal
                Intent intent = new Intent(getActivity(), safataEntradaProf.class);
                startActivity(intent);
            }
        });
        mssgBoto.setOnClickListener(new View.OnClickListener() { // Configuramos el listener para el clic
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SafataMissatges.class);
                startActivity(intent);
            }
        });
        userBoto.setOnClickListener(new View.OnClickListener() { // Configuramos el listener para el clic
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), assis.class);
                startActivity(intent);
            }
        });
        horariBoto.setOnClickListener(new View.OnClickListener() { // Configuramos el listener para el clic
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HorarisProf.class);
                startActivity(intent);
            }
        });
        return view;
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public s_e_prof() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment s_e_prof.
     */
    // TODO: Rename and change types and number of parameters
    public static s_e_prof newInstance(String param1, String param2) {
        s_e_prof fragment = new s_e_prof();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
}