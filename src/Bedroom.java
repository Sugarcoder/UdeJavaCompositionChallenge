
public class Bedroom {

    private Bed bed;
    private Desk desk;
    private Lamp lamp;


    // Constructor
    public Bedroom(Bed bed, Lamp lamp, Desk desk) {
        this.bed = bed;
        this.lamp = lamp;
        this.desk = desk;
    }


    public void soft() {
        bouncy();
    }

    private void bouncy() {
        System.out.println("The pillows are soft and the bed is bouncy.");
    }


    // Getters
    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public Lamp getLamp() {
        return lamp;
    }

}
