package com.andani.animesh.fragmentbackstack2;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity  implements FragmentManager.OnBackStackChangedListener{
FragmentManager manager;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
        textView=(TextView)findViewById(R.id.textView);
        manager.addOnBackStackChangedListener(this);
    }
    public void addA(View v) {
        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group1, f1, "A");
        transaction.addToBackStack("addA");
        transaction.commit();

    }

    public void removeA(View v) {
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (f1 != null) {
            transaction.remove(f1);
            transaction.addToBackStack("removeA");
            transaction.commit();

        } else {
            Toast.makeText(this, "A has nt been added", Toast.LENGTH_LONG).show();
        }

    }

    public void addB(View v) {
        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group1, f2, "B");
        transaction.addToBackStack("addB");
        transaction.commit();
    }

    public void removeB(View v) {
        FragmentB f2 = (FragmentB) manager.findFragmentByTag("B");
        FragmentTransaction transaction = manager.beginTransaction();
        if (f2 != null) {
            transaction.remove(f2);
            transaction.addToBackStack("removeA");
            transaction.commit();

        } else {
            Toast.makeText(this, "B has nt been added", Toast.LENGTH_LONG).show();
        }



    }

    public void attachA(View v) {
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (f1 != null) {
            transaction.attach(f1);
            transaction.addToBackStack("attachA");
            transaction.commit();
        }
    }

    public void detachA(View v)
    {
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (f1 != null) {
            transaction.detach(f1);
            transaction.addToBackStack("detachA");
            transaction.commit();
        }
    }
    public  void  replaceAwB(View v)
    {
        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group1, f1, "addA");
        transaction.addToBackStack("repAwB");
        transaction.commit();
    }
    public  void  back(View v)
    {
        manager.popBackStack();
    }
    public void popstackB(View v)
    {
        manager.popBackStack("B",0);
    }
    public  void replaceBwA(View v)
    {
        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group1, f2, "A");
        transaction.addToBackStack("repBwA");
        transaction.commit();
    }


    @Override
    public void onBackStackChanged() {
        textView.setText(textView.getText()+"\n");
        textView.setText(textView.getText()+"current status");
        int count=manager.getBackStackEntryCount();
        for(int i=count-1;i>=0;i--)
        {
            FragmentManager.BackStackEntry entry=manager.getBackStackEntryAt(i);
            textView.setText(textView.getText()+ " "+entry.getName()+"\n");

        }
    }
}
