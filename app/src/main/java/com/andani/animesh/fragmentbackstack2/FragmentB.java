package com.andani.animesh.fragmentbackstack2;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by animesh on 2/10/2015.
 */
public class FragmentB  extends Fragment
{
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.layout_b,container,false);
        Log.d("ani", "oncreateView fragB");
        return  v;
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        Log.d("ani","onattach fragB");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ani","oncreate fragB");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("ani","onactivity created fragB");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("ani","onstart fragB");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("ani","onresume fragB");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("ani","onpause fragB");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("ani","onstop fragB");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("ani","ondestry fragB");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("ani","ondestroyview fragB");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("ani","ondetach fragB");
    }
}
