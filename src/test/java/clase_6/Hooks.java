package clase_6;

import org.testng.annotations.*;

public class Hooks {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }


    @Test
    public void test01(){
        System.out.println("TEST 01");
    }
    @Test
    public void test02(){
        System.out.println("TEST 02");
    }
    @Test
    public void test03(){
        System.out.println("TEST 03");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }




}
