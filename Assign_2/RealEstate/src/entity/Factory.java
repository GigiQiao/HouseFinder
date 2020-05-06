package entity;
// returns the properties the factory have
//it has boolean crane, boolean equipment, and boolean railwayAccess
public class Factory extends Building {

    private boolean crane;
    private boolean equipment;
    private boolean railwayAccess;

    public boolean isCrane() {
        return crane;
    }

    public void setCrane(boolean crane) {
        this.crane = crane;
    }

    public boolean isEquipment() {
        return equipment;
    }

    public void setEquipment(boolean equipment) {
        this.equipment = equipment;
    }

    public boolean isRailwayAccess() {
        return railwayAccess;
    }

    public void setRailwayAccess(boolean railwayAccess) {
        this.railwayAccess = railwayAccess;
    }
}
