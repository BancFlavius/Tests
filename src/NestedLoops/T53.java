package NestedLoops;

public class T53 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++)
            for (int n = 0; n <= 9; n++)
                for(int j = 0; j <= 9; j++){

                    int a = i*i*i;
                    int b = n*n*n;
                    int c = j*j*j;
                    int d = a + b + c;
                    int e = i*100 + n*10 + j;

                    if( d == e){
                        System.out.println(e);
                    }
        }
    }
}
