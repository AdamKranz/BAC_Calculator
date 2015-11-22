package purdue.team.wildhacks.bac_calculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by adam on 11/22/15.
 */
public class advicePop extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_window);
        TextView adviceText = (TextView) findViewById(R.id.adviceText);
        int random = (int) (Math.random()*10);
        switch(random) {
            case 0:
                adviceText.setText("SpaceCat says\n 'Always run with Scissors.'");
                break;
            case 1:
                adviceText.setText("SpaceCat says\n 'Go give a stranger a hug, they love that.'");
                break;
            case 2:
                adviceText.setText("SpaceCat says\n 'If you run fast enough off of a building, you can fly.'");
                break;
            case 3:
                adviceText.setText("SpaceCat says\n 'You can only be done drinking when your BAC is > 0.24'");
                break;
            case 4:
                adviceText.setText("SpaceCat says\n 'Rocks become chewable when boiled.'");
                break;
            case 5:
                adviceText.setText("SpaceCat says\n 'If you hold your breath long enough, your wish will come true.'");
                break;
            case 6:
                adviceText.setText("SpaceCat says\n 'Every pool has a scratch-and-sniff on the bottom.'");
                break;
            case 7:
                adviceText.setText("SpaceCat says\n 'Cats love baths, especially cold baths.'");
                break;
            case 8:
                adviceText.setText("SpaceCat says\n 'Don't forget to wash our computer on Rinse Only.'");
                break;
            case 9:
                adviceText.setText("SpaceCat says\n 'Phones make great frisbees.'");
                break;
        }
        DisplayMetrics dM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dM);

        int width = dM.widthPixels;
        int height = dM.heightPixels;
        getWindow().setLayout((int)(width*0.5), (int)(height*0.5));

    }
}
