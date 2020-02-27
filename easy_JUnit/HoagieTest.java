package test1;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class HoagieTest {
	
	@Test
	public void json() throws IOException{
		Hoagie hoagie =new Hoagie("3","1");
		String sandwich=hoagie.getSandwich();
		assertEquals("131",sandwich);	
	}

}
