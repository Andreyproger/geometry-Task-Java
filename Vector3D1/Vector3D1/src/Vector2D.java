
public class Vector2D extends Vector{
	//*super - вызов родительского класса*//
	
	public Vector2D (double [] a){
		
	super (a);
	if (a.length != 2)  throw new IllegalArgumentException("dimensions disagree");
	}
	

	public Vector2D (Vector a){
		
	super (a);
	
	}
	
}

