
 class Segment {
	 Vector3D a;
	 Vector3D b;
    
	 public Segment (Vector3D a, Vector3D b)
	 {
		 this.a=a;
		 this.b=b;
	 }	
	 
	 public double len(){
		return a.sub(b).len(); 
	 }
	 
	 public   double distanceTo(Vector3D point){
		 double l1 = point.sub(a).scalar(b.sub(a));
		 System.out.println(l1);
		
		 double l2 = point.sub(b).scalar(a.sub(b));
		 if (l1<=0) {return point.sub(a).len() ;} else {if (l2<=0) {return point.sub(b).len();} else {
			 double p = (point.sub(a).len()+point.sub(b).len()+a.sub(b).len())/2;
			 
			 double s = Math.sqrt(p*(p-point.sub(a).len())*(p-point.sub(b).len())*(p-a.sub(b).len()));
			 double h = 2*s/(a.sub(b).len());
			 
			 return h;
			 
		
		 }}
	 }
		
		 
		 
	 
}
