import static org.junit.Assert.*;

import org.junit.Test;

public class Test_1 {

	@org.junit.Test
	public void testADD() {
	Vector3D v = new Vector3D(3.0, 4.0, 0.0);
	Vector3D add1 = v.add(v);
	assertEquals(6.0, add1.getX(), 0.001);
	assertEquals(8.0, add1.getY(), 0.001);
	assertEquals(0.0, add1.getZ(), 0.001);}
	
	public void testSUB (){
	Vector3D v = new Vector3D(3.0, 4.0, 0.0);
	Vector3D sub1 = v.sub(v);
	assertEquals(0.0, sub1.getX(), 0.001);
	assertEquals(0.0, sub1.getY(), 0.001);
	assertEquals(0.0, sub1.getZ(), 0.001);}
	
	public void testLEN (){
		Vector3D v = new Vector3D(3.0, 4.0, 5.0);
		double len1 = v.len();
		assertEquals(7.071, len1,0.001);}
	
	public void testSCALAR (){
		Vector3D v = new Vector3D(3.0, 4.0, 0.0);
		double scalar1 = v.scalar(v);
		assertEquals(25, scalar1,0.001);}
	
	public void testMULTIPLY (){
		Vector3D v = new Vector3D(3.0, 4.0, 0.0);
		double factor = 2.0;
		Vector3D multiply1 = v.multiply(factor);
		assertEquals(6.0, multiply1.getX(), 0.001);
		assertEquals(8.0, multiply1.getY(), 0.001);
		assertEquals(0.0, multiply1.getZ(), 0.001);}
	
	
		
	
	
		
}
	

