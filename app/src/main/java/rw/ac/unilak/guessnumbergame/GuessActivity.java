package rw.ac.unilak.guessnumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class GuessActivity extends AppCompatActivity {
TextView textv;
EditText edittx;
int number;
int guess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
        textv=findViewById(R.id.tv);
        edittx=findViewById(R.id.edit);
        Random r=new Random();
        number=r.nextInt(100);
    }

    public void CheckNumber(View view) {
        String g=edittx.getText().toString();
        guess=Integer.parseInt(g);
        if(number==guess)
            textv.setText("Congrats");
        else if (number >guess) {
            textv.setText("Your guess is Low");
            edittx.setText("");
        }
        else
        {
            textv.setText("Your guess is High");
            edittx.setText("");
        }
    }

}
