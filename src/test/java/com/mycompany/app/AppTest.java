package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
	
   String message = "Hello World";	
   App messageUtil = new App(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,App.printMessage());
   }
}
