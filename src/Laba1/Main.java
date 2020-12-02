package Laba1;

public class Main {

    public static void main(String[] args){
        System.out.println(7777777);
        Food[] breakfast = new Food[20];
        int counter = 0;
        int apples=0;
        int tea =0;
        int cheese=0;
        for (String i : args) //знач с окна
        {
            String[] parts = i.split("/");
            if (parts[0].equals("Apple")) {
                breakfast[counter] = new Apple(parts[1].toUpperCase());
                apples++;
            }
            if (parts[0].equals("Cheese")) {
                breakfast[counter] = new Cheese();
                cheese++;
            }
            if (parts[0].equals("Tea")) {
                breakfast[counter] = new Tea(parts[1].toUpperCase());
                tea++;
            }
        }
        for (Food item:breakfast){
            if(item!=null){item.consume();}
            else break;
        }
        System.out.println(apples+"Apples");
        System.out.println(cheese+"Cheese");
        System.out.println(tea+"Tea");
    }
}
