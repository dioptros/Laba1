package Laba1;

public class Main {

    public static void main(String[] args){
        System.out.println(7777777);
        Food[] breakfast = new Food[20];
        int counter = 0;
        for (String i : args) //знач с окна
        {
            String[] parts = i.split("/");
            if (parts[0].equals("Apple")) {
                breakfast[counter] = new Apple(parts[1].toUpperCase());
                breakfast[counter].consume();
            }
            if (parts[0].equals("Cheese")) {
                breakfast[counter] = new Cheese();
                breakfast[counter].consume();
            }
            if (parts[0].equals("Tea")) {
                breakfast[counter] = new Tea(parts[1].toUpperCase());
                breakfast[counter].consume();
            }
        }
        for (Food item:breakfast){
            if(item!=null){item.consume();}
            else break;
        }
    }
}