package Basic;

public class Loop {
    public static void main(String[] args) {

        /*
         For loop
         While Loop
         DO While Loop
         For each loop ( Enhanced for loop)

         While loop
         -------------
         while(Condition){

         }

        */
        // While Loop
        int i = 1;

        while (i<=10){
            System.out.println(i);
            i+=3;
        }

        // Do While Loop
        int doxmple = 1;
        do {
            System.out.println("Must execute");
            doxmple ++;
        } while (doxmple<10);

        // For Loop

        for (int j=0;j<10;j++){
            System.out.println("This is Foor Loop Example");
        }

        // For loop with break

        for (int k=0;k<10;k++){
            if (k==5){
                break;
            }
            System.out.println("This is K "+k);
        }




    }
}
