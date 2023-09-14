package ru.mirea.koputina.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Kopytina EV, BSBO-07-21, Количество символов - Х",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}