/**
 * Created by Sugarcoder on 8/14/2015.
 */

public class Main {

    public static void main(String [] args) {
        Bed bed = new Bed(2, 1);
        Desk desk = new Desk(1, 3);
        Lamp lamp = new Lamp(1);

        Bedroom bedroom = new Bedroom(bed, lamp, desk);
        bedroom.soft();
    }

}
