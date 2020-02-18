package lesson22;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass {
    @Test
    public void test(){
        System.out.println("Step 1");
        Assert.assertTrue(true,"Step 1");
        System.out.println("Step 2");
        Assert.assertTrue(true,"Step 2");
        System.out.println("Step 3");
        Assert.assertTrue(true,"Step 3");
        System.out.println("Step 4");
        Assert.assertTrue(true,"Step 4");
    }
    @Test
    public void test1(){
        SoftAssert softAssert=new SoftAssert();
        System.out.println("step 1");
        softAssert.assertTrue(false,"assert step 1");
        System.out.println("step 2");
        softAssert.assertTrue(false,"assert step 2");
        System.out.println("step 3");
        softAssert.assertTrue(false,"assert step 3");
        System.out.println("step 4");
        softAssert.assertTrue(false,"assert step 4");
        softAssert.assertAll();

    }
}
