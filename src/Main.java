package src;

public class Main {

    public static void main(String[] args) {
        ArrList testArray = new ArrList(2);
        testArray.addLast("hello");
        testArray.addLast("there");
        System.out.println(testArray);
        testArray.addLast("brown");
        System.out.println(testArray);
        testArray.addLast("bear");
        System.out.println(testArray);
        testArray.addLast("!");
        System.out.println(testArray);
    }
}
