package purdue.team.wildhacks.bac_calculator;

/**
 * Created by Owner on 11/21/2015.
 */
public class BAC {


    //Instance Variable
    private double amountOfAlcohol;
    private double weight;
    private double alcoholDistribution;
    private User user;
    private double timeOfCreation;


    public BAC (User user, double amountOfAlcohol) {
        this.user = user;
        this.amountOfAlcohol = amountOfAlcohol;
        this.weight = user.getWeight();
        this.timeOfCreation = System.currentTimeMillis();
        if (user.isFemale()) {
            this.alcoholDistribution = 0.66;
        } else {
            this.alcoholDistribution = 0.73;
        }
    }
    //inHours
    public Double getTime() {
        double timeInMin = (System.currentTimeMillis() / 60000);
        double timeInHours = timeInMin / 60;
        return timeInHours;
    }
    public Double getBAC() {
        double timeInMin = ((System.currentTimeMillis() - timeOfCreation) / 60000);
        double timeInHours = timeInMin / 60;

        Double bAC = ((amountOfAlcohol*5.14) / (weight * alcoholDistribution)) - (0.015 * timeInHours);
        return bAC;
    }

}
