package LinkTest;

import LinkLesson.Linked;
import org.junit.*;

public class TestLink {


    static Linked<Integer> myTestLink = new Linked();

    @BeforeClass
    public static void te(){
        //myTestLink.add(12);
    }

    @Test
    public void getTest() {
        Assert.assertEquals(new Integer(12), myTestLink.get(0));
    }

    @Test
    public void indexOfTest() {
        Assert.assertEquals(0, myTestLink.indexOf(12));
    }

    @Test
    public void addTest(){
        myTestLink.add(12);

        Assert.assertEquals(0, myTestLink.getSize());

        myTestLink.add(13);
        myTestLink.add(14);
        myTestLink.add(16);

        Assert.assertEquals(3, myTestLink.getSize());
    }




}
