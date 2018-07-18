public class problem {

	public static void main(String[] args) {
		boolean good = false;
		Vector2D A = new Vector2D(new double[] {1, 1});
		Vector2D B = new Vector2D(new double[] {3,1});
		Vector2D C = new Vector2D(new double[] {1, 3});	
		Vector2D D = null;
		
		Vector2D AB = new Vector2D (B.sub(A));
		Vector2D AC = new Vector2D  (C.sub(A));
		Vector2D CB = new Vector2D  (B.sub(C));
		
		
		if (B.sub(A).scalar(C.sub(A)) == 0) 
			if (AB.len() == AC.len())
			{
				good = true;
				D = new Vector2D (B.add(C.sub(A)));
			}
		
		
		if (A.sub(B).scalar(C.sub(B)) == 0) 
			if (AB.len() == CB.len())
			{
				good = true;
				D = new Vector2D (A.add(C.sub(B)));
			}
		
		
		if (A.sub(C).scalar(B.sub(C)) == 0) 
			if (AC.len() == CB.len())
			{
				good = true;
				D = new Vector2D (B.add(A.sub(C)));
			}
		
		
		if (good)
			System.out.println("D = " + D);
		else
			System.out.println("Bad ");
	}

}
