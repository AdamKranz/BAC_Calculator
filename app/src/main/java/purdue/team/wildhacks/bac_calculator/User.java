package purdue.team.wildhacks.bac_calculator;

/**
 * Created by Owner on 11/21/2015.
 */
public class User {
    private String name;
    private double weight;
    private boolean female; //True is Female && False is Male

    public User(String name, double weight, boolean gender) {
        this.name = name;
        this.weight = weight;
        this.female = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isFemale() {
        return female;
    }
}
