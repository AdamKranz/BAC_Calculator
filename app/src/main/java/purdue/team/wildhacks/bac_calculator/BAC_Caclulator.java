package purdue.team.wildhacks.bac_calculator;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class BAC_Caclulator extends AppCompatActivity {
    BACcalculator Calc = new BACcalculator();
    TextView drinkCount;
    User user;
    TextView status;
    TextView bac;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bac__caclulator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String name = getIntent().getExtras().getString(("name"));
        String wString = getIntent().getExtras().getString("weight");
        Double weight = Double.parseDouble(wString);

        Boolean female = getIntent().getExtras().getBoolean("female", true);
        user = new User(null, weight, female);
        bac = (TextView) findViewById(R.id.BAC);
        status = (TextView) findViewById(R.id.status);
        count = 0;
        ImageButton shotButton = (ImageButton) findViewById(R.id.shotsButton);
        ImageButton beerButton = (ImageButton) findViewById(R.id.beerButton);
        ImageButton wineButton = (ImageButton) findViewById(R.id.wineButton);
        ImageButton miscButton = (ImageButton) findViewById(R.id.qButton);
        Button adviceButton = (Button) findViewById(R.id.advice);
        drinkCount = (TextView) findViewById(R.id.drinkCounter);
        adviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BAC_Caclulator.this, advicePop.class));
            }
        });
        shotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc.addBAC(user, 0.6);
                bac.setText("" + Calc.getTotalBAC());
                if (Calc.getTotalBAC() < .03)
                    status.setText("SUBCLINICAL");
                else if (Calc.getTotalBAC() < .09)
                    status.setText("EUPHORIA");
                else if (Calc.getTotalBAC() < 0.18)
                    status.setText("EXCITEMENT");
                else if (Calc.getTotalBAC() < 0.25)
                    status.setText("CONFUSION");
                else if (Calc.getTotalBAC() < 0.35)
                    status.setText("STUPOR");
                else if (Calc.getTotalBAC() < 0.45)
                    status.setText("COMA");
                else
                    status.setText("DEATH");
                count++;
                drinkCount.setText(""+count);
            }
        });
        beerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc.addBAC(user, 0.6);
                bac.setText("" + Calc.getTotalBAC());
                if (Calc.getTotalBAC() < .03)
                    status.setText("SUBCLINICAL");
                else if (Calc.getTotalBAC() < .09)
                    status.setText("EUPHORIA");
                else if (Calc.getTotalBAC() < 0.18)
                    status.setText("EXCITEMENT");
                else if (Calc.getTotalBAC() < 0.25)
                    status.setText("CONFUSION");
                else if (Calc.getTotalBAC() < 0.35)
                    status.setText("STUPOR");
                else if (Calc.getTotalBAC() < 0.45)
                    status.setText("COMA");
                else
                    status.setText("DEATH");
                count++;
                drinkCount.setText(""+count);
            }
        });
        wineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc.addBAC(user, 0.6);
                bac.setText("" + Calc.getTotalBAC());
                if (Calc.getTotalBAC() < .03)
                    status.setText("SUBCLINICAL");
                else if (Calc.getTotalBAC() < .09)
                    status.setText("EUPHORIA");
                else if (Calc.getTotalBAC() < 0.18)
                    status.setText("EXCITEMENT");
                else if (Calc.getTotalBAC() < 0.25)
                    status.setText("CONFUSION");
                else if (Calc.getTotalBAC() < 0.35)
                    status.setText("STUPOR");
                else if (Calc.getTotalBAC() < 0.45)
                    status.setText("COMA");
                else
                    status.setText("DEATH");
                count++;
                drinkCount.setText(""+count);
            }
        });
        miscButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc.addBAC(user, 1.2);
                bac.setText("" + Calc.getTotalBAC());
                if (Calc.getTotalBAC() < .03)
                    status.setText("SUBCLINICAL");
                else if (Calc.getTotalBAC() < .09)
                    status.setText("EUPHORIA");
                else if (Calc.getTotalBAC() < 0.18)
                    status.setText("EXCITEMENT");
                else if (Calc.getTotalBAC() < 0.25)
                    status.setText("CONFUSION");
                else if (Calc.getTotalBAC() < 0.35)
                    status.setText("STUPOR");
                else if (Calc.getTotalBAC() < 0.45)
                    status.setText("COMA");
                else
                    status.setText("DEATH");
                count++;
                drinkCount.setText(""+count);
            }
        });
    }
}
