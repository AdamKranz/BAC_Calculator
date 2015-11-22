package purdue.team.wildhacks.bac_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class UserInput extends AppCompatActivity {
    boolean female = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText nameEditText = (EditText) findViewById(R.id.editText);
        final EditText weightEditText = (EditText) findViewById(R.id.editText2);
        Button button = (Button) findViewById(R.id.button);
        RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton isFemale = (RadioButton) findViewById(R.id.female);
        RadioButton isMale = (RadioButton) findViewById(R.id.notFemale);

        isFemale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    female = true;
            }
        });
        isMale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    female = false;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                int weight = Integer.parseInt(weightEditText.getText().toString());

                Intent intent = new Intent(UserInput.this, BAC_Caclulator.class);
                intent.putExtra("name", name);
                intent.putExtra("weight", "" + weight);
                intent.putExtra("female", female);
                startActivity(intent);

            }
        });

    }

}
