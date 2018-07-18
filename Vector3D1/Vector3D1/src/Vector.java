
public class Vector {
	private double[] components;
	private int dim;
	
	public Vector(double [] a) 
	{
		this.components = a;
	}
	
	public Vector(Vector a) 
	{
		this.components = a.components;
	}
	
	public int Dimension(){
		return components.length;
	};

	public double getComponent(int i){
		return components[i];
	}
	
	public double scalar(Vector v)
	{    int dim = Math.min(v.Dimension(),this.Dimension());
		double s = 0;
		for (int i = 0; i < dim; i++)
			s += components[i] * v.getComponent(i);
		return s;
		
	};
	
	public double len()
	{
		return Math.sqrt(this.scalar(this));
	}
	
	
	public Vector multiply(double factor) {	
		  dim = this.Dimension();
		double [] a = new double [dim];
		for (int i=0; i<dim;i++)
			a[i] = this.getComponent(i)*factor;
		return new Vector(a);
	}

	
	public Vector add(Vector v) {
		 int dim = Math.min(v.Dimension(),this.Dimension());
		double [] a = new double [dim];
		for (int i=0; i<dim;i++)
			a[i] =this.getComponent(i)+v.getComponent(i);
		return new Vector(a);
	}


	public Vector sub(Vector v) {
		 int dim = Math.min(v.Dimension(),this.Dimension());
		double [] a = new double [dim];
		for (int i=0; i<dim;i++)
			a[i] =this.getComponent(i)-v.getComponent(i);
		return new Vector(a);	
	}
	public String toString() 
	{
		
		String res ="(";
		for (int i=0; i<this.Dimension(); i++)
			res = res + + this.getComponent(i) + "," ;
			res = res + ")";
		return res;
	}
}