package LinkLesson;

public class MyCustomException extends IndexOutOfBoundsException{

    public MyCustomException(int index) {
        //super(index);
        printInfo(index);
    }

    private void printInfo(int index){
        System.err.println("incorrect index in array " + index);
    }
}
