package entity;

// residential describe the property residential has:
// describe if the residential has these or not
// boolean has sewer or not, boolean has water or not, boolean has garage or not, boolean has pool or not
public class Residential extends CommonProperties {
  
    private boolean sewer;
    private boolean water;
    private boolean garage;
    private boolean pool;

    public boolean isSewer() {
        return sewer;
    }

    public void setSewer(boolean sewer) {
        this.sewer = sewer;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }
}
