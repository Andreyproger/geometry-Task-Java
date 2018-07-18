
public class Problem1 {

	public static void main(String[] args) {
		Vector3D a = new Vector3D(3,6,4);
		Vector3D b = new Vector3D(5,10,4);
		Vector3D point = new Vector3D(8,16,6);
      
		Segment ab = new Segment (a,b);
	
		 System.out.println (ab.distanceTo(point));
		
	}

}
