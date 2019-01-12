package app.theoneandonly.com.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    // Variabile pentru fiecare element
    public Button rollButton;
    public SeekBar seekBar;
    public TextView resultsTextView;
    public TextView resultsTextView2;
    // Variabile pentru valori aleatorii
    public int rand ;
    public int rand2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Aceasta functie se apeleaza automat la incarcarea aplicatiei
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pune layoutul ca sa il vedem

        // Conectam elementele la variabile
        rollButton = (Button) findViewById(R.id.rollButton);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        resultsTextView = (TextView) findViewById(R.id.restultsTextView);
        resultsTextView2 = (TextView) findViewById(R.id.restultsTextView2);

        //
        rollButton.setOnClickListener(new View.OnClickListener()
        {
            // Functia de Click
            @Override
            public void onClick(View v)
            {
                // Generam o valoare Random pentru primul textView intre 0 si valoarea seekBarului selectata + 1 (pentru ca incepe de la 0)
                rand = new Random().nextInt(seekBar.getProgress()+1);
                //  nextInt = genereaza numar intre 0 si 5
                rand += 1;
                // Transformam un numar intreg in string pentru a putea afisa in textView
                resultsTextView.setText(String.valueOf(rand));

                // Similar cu mai sus
                rand2 = new Random().nextInt(seekBar.getProgress()+1);
                rand2 += 1;
                resultsTextView2.setText(String.valueOf(rand2));
            }
        });
        }
}
