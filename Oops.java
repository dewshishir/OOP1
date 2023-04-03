class Pen{
    String colour;
    String type;

    public void write(){             //method
        System.out.println("write");
    }
    public void printColour(){             //method
        System.out.println(this.colour);  //this keyword
    }
}
public class Oops {
    public static void main(String args[]){
        Pen pen1 = new Pen();    //object
        pen1.colour = "bluw";
        pen1.type = "gel";

        Pen pen2 = new Pen();    //object
        pen2.colour = "reed";
        pen2.type = "gelpen";

        pen1.printColour(); //this dara bujbi kn object ek call kra lagbi
        pen2.printColour();
    }
}
