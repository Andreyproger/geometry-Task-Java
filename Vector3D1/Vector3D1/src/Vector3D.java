
class Vector3D{
      private double x;
      private double y;
      private double z;


    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    };


    public Vector3D add(Vector3D vector) {
        return  new Vector3D (x+vector.getX(), y+vector.getY(),z+vector.getZ());
    };

    public Vector3D sub(Vector3D vector){
        return new Vector3D (x-vector.getX(), y-vector.getY(), z-vector.getZ());
    };

    public Vector3D multiply(double factor){
        return new Vector3D (x*factor, y*factor,z*factor);
    };

    public double  len (){
        return Math.sqrt(x*x+y*y+z*z);
    };
    
    public double scalar(Vector3D vector) {
        return (x * vector.getX() + y * vector.getY() + z * vector.getZ());
    };


    public double getX(){
        return x;};
    public double getY(){
        return y;};
    public double getZ(){
        return z;};



};
