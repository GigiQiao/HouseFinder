package entity;

//it describes the properties that a store has
//it describe the store has these or not
// boolean has shelves or not, boolean has checkout or not, boolean safe or not
public class Store extends Building {
  
    private boolean shelves;
    private boolean checkout;
    private boolean safe;

    public boolean isShelves() {
        return shelves;
    }

    public void setShelves(boolean shelves) {
        this.shelves = shelves;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }
}
