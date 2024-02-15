package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

  @Before
  public void setUp(){
      System.out.println("Before methot çalıştı.");
  }

  @After
    public void tearDown(){
      System.out.println("After method çalıştı.");

      // driver kapatma
      // fail olan testlerde screenshot alma...........


  }

}
