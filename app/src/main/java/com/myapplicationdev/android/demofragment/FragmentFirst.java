package com.myapplicationdev.android.demofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentFirst#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentFirst extends Fragment implements View.OnClickListener {

    // Views
    private Button addTextButton;
    private TextView textView;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentFirst() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentFirst.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentFirst newInstance(String param1, String param2) {
        FragmentFirst fragment = new FragmentFirst();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        addTextButton = view.findViewById(R.id.frag1_add_text_button);
        addTextButton.setOnClickListener(this::onClick);
        textView = view.findViewById(R.id.frag1_text_view);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frag1_add_text_button:
                String data = textView.getText().toString() + "\n" + "New Data";
                textView.setText(data);
                break;
        }
    }
}