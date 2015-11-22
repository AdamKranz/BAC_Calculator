package purdue.team.wildhacks.bac_calculator;
import java.util.ArrayList;
/**
 * Created by Owner on 11/21/2015.
 */
public class BACcalculator {
    private ArrayList<BAC> allBAC = new ArrayList<>();
    public ArrayList<BAC> addBAC(User user, double amountOfAlcohol) {
        allBAC.add(new BAC(user, amountOfAlcohol));
        return allBAC;
    }
    public double getTotalBAC() {
        double totalBAC = 0;
        for (int i = 0; i < (allBAC.size()); i++) {
            totalBAC = totalBAC + allBAC.get(i).getBAC();
        }
        return totalBAC;
    }
}