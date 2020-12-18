public class Area {

    public void calculateArea(int r){
        double d=3.14*r*r;
        System.out.println("Area of circle: "+d);
    }

    public void calculateArea(int l,int b){
        int rect=l*b;
        System.out.println("Area of rect: "+rect);
    }

    public static void main(String[] args) {
        Area a=new Area();
        a.calculateArea(10);
        a.calculateArea(10,20);
    }
}
