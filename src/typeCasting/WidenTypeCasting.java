package typeCasting;

public class WidenTypeCasting {

    public static void main(String[] args){

        int i = 100;  //declare an integercalled i and assign a value of 100

        long l = i;

        float f = l;

        System.out.println("int value " + i);
        System.out.println("long value " + l);
        System.out.println("float value " + f);
    }
}
