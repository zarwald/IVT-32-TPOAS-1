package prog_pril.lab_1_2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MainWindowTests {
	@Test void calculateTest() {
		MainWindow window = new MainWindow();
		
		double precicion = 0.0000001;
		
		int x1 = -12;
		int y1 = -50;
		int z1 = -3;
		double ro1 = 51.4198405;
		double phi1 = 1.3352513;
		double zo1 = -3.0000000;
		
		int x2 = -4;
		int y2 = 4;
		int z2 = 10;
		double ro2 = 5.6568542;
		double phi2 = -0.7853982;
		double zo2 = 10.0;
		
		int x3 = 0;
		int y3 = 1;
		int z3 = -1;
		double ro3 = 1.0;
		double phi3 = 1.5707963;
		double zo3 = -1.0;
		
		int x4 = 1;
		int y4 = 0;
		int z4 = 0;
		double ro4 = 1.0;
		double phi4 = 0.0;
		double zo4 = 0.0;

		window.setValues(x1, y1, z1);
		window.calculate();

		assertEquals(ro1, window.roValue, precicion);
		assertEquals(phi1, window.phiValue, precicion);
		assertEquals(zo1, window.zValue, precicion);
		
		window.setValues(x2, y2, z2);
		window.calculate();

		assertEquals(ro2, window.roValue, precicion);
		assertEquals(phi2, window.phiValue, precicion);
		assertEquals(zo2, window.zValue, precicion);
		
		window.setValues(x3, y3, z3);
		window.calculate();

		assertEquals(ro3, window.roValue, precicion);
		assertEquals(phi3, window.phiValue, precicion);
		assertEquals(zo3, window.zValue, precicion);
		
		window.setValues(x4, y4, z4);
		window.calculate();

		assertEquals(ro4, window.roValue, precicion);
		assertEquals(phi4, window.phiValue, precicion);
		assertEquals(zo4, window.zValue, precicion);
	}
}
