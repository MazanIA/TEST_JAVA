package work_6;

public class Thing {

    private float weight;
    private float cost;
    //private float coefficient;

    public Thing(float weight, float cost) {
        this.weight = weight;
        this.cost = cost;
        //coefficient = weight / cost;
    }

    /*public float getCoefficient() {
        return coefficient;
    }*/

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
