package entity;
// describe the commercial retail which returns one of the three types
// the retail type include: strip mall, large mall, street
public class CommercialRetail extends CommonProperties{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
