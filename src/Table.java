public class Table {

        private String name;
        private int itemCount=0;
        private  MenuItem[] items = new MenuItem[10];


    public Table(String NAME, int itemCount){
        this.name=NAME;
        this.itemCount= 0;
    }


    public void setName(String name) {         

        this.name = name;
    }

    public MenuItem[] getItems() {

        return items;
    }

    public void addItem(MenuItem item) {
        this.items[itemCount] = item;
        itemCount++;
    }
     public String getName(){

         return name;
    }



    public double getTotalPrice(){
         double total=0;
         for(int i=0; i < itemCount; i++){
            total+=items[i].getItemPrice();
         }
         return total;

    }
    public int determinePrepTime(){
        int maxTime=0;
        for(int i =0; i< itemCount;i++){
            int time = items[i].getPrepTime();
            if(time>maxTime){
                maxTime=time;
            }

        }
            return maxTime;
    }
    public String toString(){
        String list = "";
        for(int i=0; i < itemCount; i++){
            list+= " Menu Item: "+ items[i].getName()+", ";
        }

        double tp = getTotalPrice();
        int prepTime = determinePrepTime();

        list += "Price:$ "+ tp + ", " +" Preparation time: "+ prepTime + " minutes";

        return list;

    }

}
