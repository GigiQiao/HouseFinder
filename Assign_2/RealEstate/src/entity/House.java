package entity;
// the properties house has
// integer bedrooms number, integer bathroom number, boolean has basement or not
// string house type, which returns one of the 6 kind: 
//condo, row, semi, bungalow, split, two story

public class House extends Building {

    private int bedrooms;
    private int bathrooms;
    private boolean basement;

    private String type;

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean isBasement() {
        return basement;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
