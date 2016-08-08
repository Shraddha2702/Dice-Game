package info.diceproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button Roll,Hold,Reset;
    TextView myscore,compscore;
    ImageView iv;
    int x=0;
    int y=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Roll=(Button)findViewById(R.id.roll);
        Hold=(Button)findViewById(R.id.hold);
        Reset=(Button)findViewById(R.id.reset);

        myscore=(TextView)findViewById(R.id.myscore);
        compscore=(TextView)findViewById(R.id.compscore);

        iv=(ImageView)findViewById(R.id.dice);

        myscore.setText(" "+x);
        compscore.setText(" "+y);



        Roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r=new Random();
               // int a=0;

                int a=r.nextInt(6)+1;
                x=x+a;

                switch (a)
                {
                    case 1:
                        iv.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        iv.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        iv.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        iv.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        iv.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        iv.setImageResource(R.drawable.dice6);
                        break;
                }

                myscore.setText(""+x);
                Roll.setEnabled(false);
                Hold.setEnabled(true);

                if(x>=50){
                    Toast.makeText(getApplicationContext(),"You Won!!!",Toast.LENGTH_LONG).show();
                    Hold.setEnabled(false);
                    Roll.setEnabled(false);
                }
            }
        });


        Hold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r=new Random();
               // int a=0;
                int a=r.nextInt(6)+1;
                y=y+a;

                switch (a)
                {
                    case 1:
                        iv.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        iv.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        iv.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        iv.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        iv.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        iv.setImageResource(R.drawable.dice6);
                        break;
                }

                compscore.setText(""+y);
                Hold.setEnabled(false);
                Roll.setEnabled(true);

                if(y>=50){
                    Toast.makeText(getApplicationContext(),"Computer Won!!!",Toast.LENGTH_LONG).show();
                    Hold.setEnabled(false);
                    Roll.setEnabled(false);
                }
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compscore.setText(" " + 0);
                myscore.setText(" " + 0);
            }
        });
    }
}
