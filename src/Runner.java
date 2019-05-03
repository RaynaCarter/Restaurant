public class Runner {
    public static void main(String[]args){



        Ingredient cheese= new  Ingredient("Cheese",3.50);
        Ingredient pasta= new  Ingredient("Pasta",2);
        Ingredient chicken= new  Ingredient("Chicken",5.25);
        Ingredient peppers= new  Ingredient("Peppers",1.30);


        MenuItem special = new MenuItem("Special",3,10);
        MenuItem veggie = new MenuItem("Veggie",3,15);
        MenuItem plain = new MenuItem("Plain",2,20);

        special.setIngreInfo(cheese);
        special.setIngreInfo(pasta);
        special.setIngreInfo(chicken);

        veggie.setIngreInfo(cheese);
        veggie.setIngreInfo(pasta);
        veggie.setIngreInfo(peppers);

        plain.setIngreInfo(pasta);
        plain.setIngreInfo(peppers);


        
        Table t = new Table("Table 1",3);

        t.addItem(special);
        t.addItem(special);
        t.addItem(veggie);

        Table w = new Table("Table2",5);
        w.addItem(veggie);
        w.addItem(veggie);
        w.addItem(veggie);
        w.addItem(plain);
        w.addItem(plain);

        System.out.println(t.toString());
        System.out.println(w.toString());



    }
}
