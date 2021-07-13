package Basic;

public class OpreatorAndConditionalStatement {

    public static void main(String[] args) {
// Data Type - Int,Float,Double,String,Char,Boolean
        int i=10;
        double d = 2.26;
        String c = "a";
        boolean b = true;
        System.out.println(i+d);
        System.out.println(c+d);

        i++;
        i--;


        System.out.println(i);
        i+=5;
        i-=10;
        System.out.println(i);
//        System.out.println("This is Java Reacp");
//        System.out.println(20+10);


//        Conditional Operator
        boolean ans = false;
        if (ans){
            System.out.println(" this is True block ");
        } else {
            System.out.println("this is false block");
        }

        // if multiple condition arise then use elseif
//        if (condition){
//
//        } else if (condition){
//
//        } else if (condtion){
//
//        } else {
//
//        }





        int age = 18;

        if (age>18){
            System.out.println("You are adult");
        } else if (age>20){
            System.out.println("Passed");
        } else {
            System.out.println("not passed");
        }



        // Swith case
        int day = 4;

        switch (day){
            case 1: {
                System.out.println("Saturday");
                break;
            }

            case 2: {
                System.out.println("sunday");
                break;
            }
            case 3: {
                System.out.println("Monday");
                break;
            }
            case 4: {
                System.out.println("Tuesday");
                break;
            } case 5: {
                System.out.println("wednesday");
                break;
            }
         case 6: {
            System.out.println("Thursday");
            break;
        }
     case 7: {
        System.out.println("Friday");

    }
            default:
                System.out.println("No Value Found");


        }


    }
}

