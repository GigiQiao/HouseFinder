package entity;
// commercial Industrial describes industrial property
// it has industrial type which has: light, medium, heavy
public class CommercialIndustrial extends CommonProperties {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
