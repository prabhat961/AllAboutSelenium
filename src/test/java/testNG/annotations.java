package testNG;

import org.testng.annotations.*;

public class annotations {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("this is before suite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("this is after suite");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("this is before class");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("this is after class");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("this is before test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("this is after test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after Method");
    }
    @Test
    public void Test1(){
        System.out.println("This is Test1");
    }
    @Test
    public void Test2(){
        System.out.println("This is Test2");
    }

    @Test
    public void Test4(){
        System.out.println("This is Test4");
    }
    @Test
    public void Test3(){
        System.out.println("This is Test3");
    }


}
