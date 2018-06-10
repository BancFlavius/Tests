package ForLoops;

public class T16 {
    public static void main(String[] args) {
        double y;
        for(double x = -10.0; x <= 10.0; x += 0.5){
            y = x*x;
            System.out.println(x+"   "+y);
        }
    }
}
