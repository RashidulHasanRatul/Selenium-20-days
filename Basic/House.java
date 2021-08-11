package OOp;

public class House {

    String adress;
    String color;
    double area;

    void opendor(){

        System.out.println("Door is Openning");
    }

    void closeDoor(){
        System.out.println("Door is Colse ing ");
    }

    void setAdress(String adress){
        this.adress = adress;
    }

    public static void main(String[] args) {

        House RatulsHouse = new House();
        RatulsHouse.opendor();
        RatulsHouse.closeDoor();
        RatulsHouse.setAdress("Teligram");

        System.out.printf(RatulsHouse.adress);

    }

}
