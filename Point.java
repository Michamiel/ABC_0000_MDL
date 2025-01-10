public class Point {

    private float X;
    private float Y;

    public Point() {

    };

    public Point(float X, float Y) {

        this.X = X;
        this.Y = Y;

    };

    public Point(Point point1) {

    }

    public Point build(Point p1){

        return p1;
    }

    public void location() {
        System.out.println(X + ", " + Y);
    }

    public void showvalues() {
        System.out.println("Ce point a " + X + " pour abscisse et " + Y +  " pour ordonnée.");

    }

    public float move(float x, float y) {
        X = x;
        Y = y;
        System.out.println("Déplacement vers : " + X + ", " + Y);
        return X + Y;

    }
    public void symetryfrom0(){
        X = X*(-1);
        Y = Y*(-1);
        System.out.println("Nouvelles coordonnées du point : " + X + ", " + Y);       
    }

    public void symetryfromX(){
        Y = Y*(-1);
        System.out.println("Nouvelles coordonnées du point : " + X + ", " + Y);
    }

    public void symetryfromY(){
        X = X*(-1);
        
    System.out.println("Nouvelles coordonnées du point : " + X + ", " + Y);
    }

    public void permute(){
        float z = 0;

        z = Y;
        Y = X;
        X = z;

        System.out.println("Coordonnées du point : " + X + ", " + Y);
    }



}
