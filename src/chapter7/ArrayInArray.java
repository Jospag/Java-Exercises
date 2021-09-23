package chapter7;

public class ArrayInArray {
    public static void main(String[] args) {

        String [][] array = {{"X O X"},{"O X O"},{"X O X"}};

        multipleArrayInArray(array);
    }


    public static void multipleArrayInArray(String[][] array){
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.println(string);
            }
            System.out.println();
        }


    }
}
