package test.Junit;

import org.junit.*;

/**
 * Created by Shravya on 21/08/2015.
 */
public class JUnitBeforeAfter {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @Before
    public void beforeTest(){
        System.out.println("Before test");
    }

    @After
    public void afterTest(){
        System.out.println("After test");
    }

    @Test
    public void Test1(){
        System.out.println("This is a test1");
    }

    @Test
    public void Test2(){
        System.out.println("This is a test1");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }

}
