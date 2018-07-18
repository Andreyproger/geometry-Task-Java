import static org.junit.Assert.*;

import org.junit.Test;

public class Test_2 {

	@org.junit.Test
	public void testLEN() {
		Vector3D v = new Vector3D(3.0, 4.0, 0.0);
		Vector3D t = new Vector3D(3.0, 0, 0);
		Segment s = new Segment(v, t);
		double len1 = s.len();
		assertEquals(4,len1,0.001);
		}
	public void testDISTANCETO (){
		Vector3D v = new Vector3D(3.0, 6.0, 4.0);
		Vector3D t = new Vector3D(5.0, 10.0, 4.0);
		Vector3D p = new Vector3D (4.5,9.0,6.0);
		Segment s = new Segment(v, t);
		double len2 = s.distanceTo(p);
		assertEquals(4.123,len2,0.001);
		
	}

}
