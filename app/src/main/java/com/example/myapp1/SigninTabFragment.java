package com.example.myapp1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SigninTabFragment extends Fragment {

    FloatingActionButton button;
    AppCompatEditText email,password;
    float v = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signin_fragment, container, false);

            email = root.findViewById(R.id.email);
            password = root.findViewById(R.id.password);
            //forgot = root.findViewById(R.id.forgot);
            //button = root.findViewById(R.id.button);

            email.setTranslationY(300);
            password.setTranslationY(300);
            //forgot.setTranslationY(300);
            //button.setTranslationY(300);

            email.setAlpha(v);
            password.setAlpha(v);
            //forgot.setAlpha(v);
            //button.setAlpha(v);

            email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
            password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
            //forgot.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
            //button.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();

        return root;
    }
}