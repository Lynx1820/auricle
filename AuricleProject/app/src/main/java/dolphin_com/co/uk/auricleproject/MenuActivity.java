package dolphin_com.co.uk.auricleproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lynx313 on 11/28/17.
 */

public class MenuActivity extends AppCompatActivity {
    Button yesButton, noButton;
    int freq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final TextView tv = (TextView)findViewById(R.id.TextView01);
        tv.setText("Can you hear this sound?");
        freq = 200;
        final TextView tv2 = (TextView)findViewById(R.id.TextView02);
        tv2.setText( String.valueOf(freq) + "Hz");
        yesButton = (Button)findViewById(R.id.yesButton);
        noButton = (Button)findViewById(R.id.noButton);
        yesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                freq += 2000;
                tv2.setText(String.valueOf(freq) + "Hz");
            }
        });
        noButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                freq += 2000;
                tv2.setText(String.valueOf(freq) + "Hz");
            }
        });




    }
}
