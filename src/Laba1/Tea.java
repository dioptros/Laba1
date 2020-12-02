package Laba1;

public class Tea extends Food {
    private String color;
    public Tea(String color) {
        super( "Tea");
        this.color=color;
    }
    public void consume() {System.out.println(this + "has drunk");}
    public String getColor() {return color;}
    public void setColor() {this.color=color;}
    public String toString() {return super.name + "Color of '" + color.toUpperCase() + "' ";}

}