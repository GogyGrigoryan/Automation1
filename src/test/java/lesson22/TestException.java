package lesson22;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestException {
    Car car[]=new Car[5];
    public Object Car;

    @Test
    public void getException(){

        try{
            System.out.println(car[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("CAr");


    }
    @Test(expectedExceptions =ArithmeticException.class)
    public void test(){
   //    int x=14/0;

        int arr[]=new int[14];

        try {
           int x=14/0;


            System.out.println(arr[14]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            e.printStackTrace();
        }
     //   catch (ArithmeticException e){
       //     e.printStackTrace();
        //}
     //   catch (NullPointerException e){
       //     e.printStackTrace();
        //}
        System.out.println("hello");
        System.out.println("hello");


        Assert.assertTrue(true,"assert test");
    }
}
