package com.andani.animesh.fragmentbackstack2;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by animesh on 2/10/2015.
 */
public class FragmentA extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.layout_a,container,false);
        Log.d("ani", "oncreateview fragA");
        return v;
    }
    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        Log.d("ani","onattach fragA");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ani","oncreate fragA");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("ani","onactivity created fragA");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("ani","onstart fragA");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("ani","onresume fragA");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("ani","onpause fragA");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("ani","onstop fragA");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("ani","ondestry fragA");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("ani","ondestroyview fragA");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("ani","ondetach fragA");
    }
}


