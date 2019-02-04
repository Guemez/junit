package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ConcateTest {
	
	@Parameters
	public static Iterable<Object[]> getData(){
		List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] {3, 1, 4});
		obj.add(new Object[] {2, 5, 7});
		obj.add(new Object[] {3, 3, 6});
		return obj;
	}

	private int a, b, exp;
	
	public ConcateTest(int a, int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
	
	@Test
	void sumaTest() {
		Junit test = new Junit();
		int result = test.suma(a, b);
		assertEquals(exp, result);
	}


}
