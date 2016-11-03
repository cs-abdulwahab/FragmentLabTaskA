package com.example.abdul_wahab.fragmentlabtaska.fragments;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdul_wahab.fragmentlabtaska.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link IF1FragmentListener} interface
 * to handle interaction events.

 * create an instance of this fragment.
 */
public class F1Fragment extends Fragment implements View.OnClickListener {
    private IF1FragmentListener mListener;

    public F1Fragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View infView = inflater.inflate(R.layout.fragment_f1, container, false);

        infView.findViewById(R.id.btnRed).setOnClickListener(this);
        infView.findViewById(R.id.btnGreen).setOnClickListener(this);
        infView.findViewById(R.id.btnBlue).setOnClickListener(this);


        return infView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IF1FragmentListener) {
            mListener = (IF1FragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement IF1FragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View view) {

        if (mListener != null) {

            switch (view.getId()) {

                case R.id.btnRed:
                    mListener.onFragmentInteraction(Color.RED);
                    break;

                case R.id.btnGreen:
                    mListener.onFragmentInteraction(Color.GREEN);
                    break;

                case R.id.btnBlue:
                    mListener.onFragmentInteraction(Color.BLUE);
                    break;

            }

        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface IF1FragmentListener {
        void onFragmentInteraction(int color);
    }
}
