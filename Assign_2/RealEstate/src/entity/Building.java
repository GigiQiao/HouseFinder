package entity;

// buildings returns construction material and sqft
// construction: brick, wood, siding, others
// size, sqft is an integer
public class Building {
	
    private String constructionMaterial;
    private int size;

    public String getConstructionMaterial() {
        return constructionMaterial;
    }

    public void setConstructionMaterial(String constructionMaterial) {
        this.constructionMaterial = constructionMaterial;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
