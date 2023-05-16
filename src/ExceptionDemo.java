import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionDemo ed = new ExceptionDemo();
        try{
            ed.firstMethod(-1);
        }catch (IOException exception){
            exception.printStackTrace();
        }// always start your catches from specified exception types to more generalize
    }
    public void  firstMethod(int i) throws IOException {//declare
        try{
            secondMethod(i);
        }catch (IOException exception){
            throw new IOException("IO exception occured in second method",exception);
        }

    }

    public void secondMethod(int i) throws IOException{
        /*
        if(i < 0){
            throw new IllegalArgumentException("i cannot be negative");
            // because this is a unchecked exception, we don't have to declare exception
        }         */
        if(i < 0){
            throw  new IOException("i cannot be negative"); // checked exception
        }
    }
}
