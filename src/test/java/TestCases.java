import org.testng.annotations.*;

public class TestCases {

    @Test
    void test1(){
        System.out.println("I am inside test");
    }

    @BeforeSuite
    public void test2(){
        System.out.println("Running Before Suite");
    }

    @BeforeTest
    public void test3(){
        System.out.println("Running Before Test");
    }

    @BeforeClass
    public void test4(){
        System.out.println("Running Before Class");
    }

    @BeforeMethod
    public void test5(){
        System.out.println("Running Before Method");
    }

    @AfterMethod
    public void test6(){
        System.out.println("Running After Method");
    }

    @AfterClass
    public void test7(){
        System.out.println("Running After Class");
    }

    @AfterTest
    public void test8(){
        System.out.println("Running After Test");
    }

    @AfterSuite
    public void test9(){
        System.out.println("Running After Suite");
    }

}
