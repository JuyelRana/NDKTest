package org.careerop.ndktest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("MyLibs");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setBackgroundColor(Color.GREEN);

        TextView textView = new TextView(this);
        textView.setText(NativeClass.getMessageFormJni());
        linearLayout.addView(textView);
        setContentView(linearLayout);

    }
}
