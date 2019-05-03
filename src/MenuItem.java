public class MenuItem {
     private Ingredient[] ingreInfo = new Ingredient[10];
     private String name;
     private int ingredientCount;
     private int prepTime;

    public MenuItem(String name, int ingredientCount, int prepTime) {
        this.name= name;
        this.ingredientCount= 0;
        this.prepTime= prepTime;

    }

    public Ingredient[] getIngreInfo() {

        return ingreInfo;
    }

    public void setIngreInfo(Ingredient ingreInfo) {
        this.ingreInfo[ingredientCount] = ingreInfo;
        ingredientCount++;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPrepTime() {

        return prepTime;
    }

    public void setPrepTime(int prepTime) {

        this.prepTime = prepTime;
    }
    public double getItemPrice(){
        double menuItemPrice=0;
        for(int i=0; i < ingredientCount; i++){
            menuItemPrice+=ingreInfo[i].getPrice();
        }
        return menuItemPrice;
    }
}
