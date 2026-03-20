package prog_pril.lab_1_2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MainWindowTests {
	static double precision = 0.0000001;
	
	@Test void calculateTest1() {
		MainWindow window = new MainWindow();

		int x = 1;
		int y = 0;
		int z = 0;
		double ro = 1.0;
		double phi = 0.0;
		double zo = 0.0;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, precision);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}
	
	@Test void calculateTest2() {
		MainWindow window = new MainWindow();

		int x = 0;
		int y = 1;
		int z = -1;
		double ro = 1.0;
		double phi = 1.5707963;
		double zo = -1.0;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, precision);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}
	
	@Test void calculateTest3() {
		MainWindow window = new MainWindow();

		int x = 1;
		int y = 1;
		int z = 1;
		double ro = 1.4142136;
		double phi = 0.7853982;
		double zo = 1.0;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, precision);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}
	
	@Test void calculateTest4() {
		MainWindow window = new MainWindow();

		int x = -1;
		int y = -1;
		int z = -1;
		double ro = 1.4142136;
		double phi = 0.7853982;
		double zo = -1.0;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, precision);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}
	
	@Test void calculateTest5() {
		MainWindow window = new MainWindow();

		int x = -4;
		int y = 4;
		int z = 10;
		double ro = 5.6568542;
		double phi = -0.7853982;
		double zo = 10.0;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, precision);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}
	
	@Test void calculateTest6() {
		MainWindow window = new MainWindow();

		int x = -10;
		int y = -10;
		int z = -10;
		double ro = 14.1421356;
		double phi = 0.7853982;
		double zo = -10.0;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, precision);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}
	
	@Test void calculateTest7() {
		MainWindow window = new MainWindow();

		int x = -12;
		int y = -50;
		int z = -3;
		double ro = 51.4198405;
		double phi = 1.3352513;
		double zo = -3.0000000;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, precision);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}
	
	@Test void calculateTest8() {
		MainWindow window = new MainWindow();

		int x = -100;
		int y = 99;
		int z = 0;
		double ro = 140.7160261;
		double phi = -0.7803731;
		double zo = 0.0;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, precision);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}

	@Test void calculateTest9() {
		MainWindow window = new MainWindow();

		int x = Short.MAX_VALUE;
		int y = Short.MIN_VALUE;
		int z = Short.MIN_VALUE;
		double ro = 46340.2429105;
		double phi = -0.7854134;
		double zo = Short.MIN_VALUE;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, precision);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}

	@Test void calculateTest10() {
		MainWindow window = new MainWindow();

		int x = Integer.MAX_VALUE;
		int y = Integer.MIN_VALUE;
		int z = 0;
		double ro = 3037000499.3;
		double phi = -0.7853982;
		double zo = 0.0;

		window.setValues(x, y, z);
		window.calculate();

		assertEquals(ro, window.roValue, 0.1);
		assertEquals(phi, window.phiValue, precision);
		assertEquals(zo, window.zValue, precision);
	}
}
