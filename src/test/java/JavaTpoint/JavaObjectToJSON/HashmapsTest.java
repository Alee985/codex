package JavaTpoint.JavaObjectToJSON;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashmapsTest {

    Hashmaps data=new Hashmaps();

    @Test
    public void testAdd(){
        data.addKeyValue("Ali",20);
        data.addKeyValue("Ahmed",30);
        Map<String,Integer> mp=data.getMaps();
        Assert.assertNotNull("The map holds Value.",mp);

    }
    @Test
    public void TestValue(){

        data.addKeyValue("Ali",20);
        data.addKeyValue("Ahmed",30);
        Assert.assertEquals(20,data.getValue("Ali"));
    }

    //data.addKeyValue("Ahmed",30);
    //@Test
    //Assert.assertEquals(expected 30,data.getKey("Ahmed"))
    //data.addKeyValue("Asif",50);
    //data.addKeyValue("Ali",20);
    //int s= data.getValue("Ali");
}