package LinkLesson;

public class RunLink {
    public static void main(String[] args) throws Exception {
        MyArray<Integer> myArr = new MyArray<>();
        for (int i = 0; i < 21; i++) {
            myArr.add(i);
        }

        System.out.println("Size - " + myArr.size);
        myArr.add(124, 1);
        System.out.println("Size - " + myArr.size);

        /*
        try {
            System.out.println(myArr.get(-1));
        } catch (MyCustomException e) {
        }
        */

        myArr.set(232, 0);
        System.out.println(myArr.get(2));

        myArr.remove(124);
        System.out.println("Size - " + myArr.size);
        System.out.println(myArr.get(1));

    }


}
