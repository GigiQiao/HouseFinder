package entity;

// farm describes the properties that a farm has
//crop has four types and this returns one of the four types: cash, vineyard, fruit, poultry
public class Farm extends Residential {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
