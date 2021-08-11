package Fundamental;

public class foreachArray {
    public static void main(String[] args) {

        String cars[] = {"Toyota","Nissan","Volvo","Honda"};

        for (String car: cars) {

            System.out.println("Cars using for each "+car);
        }

        for (int a=0;a<4;a++){
            System.out.println("Using For loop"+cars[a]);

        }
        
    }
}
