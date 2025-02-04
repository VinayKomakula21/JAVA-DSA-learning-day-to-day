
import java.util.Scanner;

public class Day_4 {
    static void findPos(int steps){
        int x=0,y=0,d=10;
        char dir='R';
        while(steps>0){
            switch (dir) {
                case 'R':{
                    x+=d;
                    d+=10;
                    dir='U';
                    break;
                }    
                case 'U':{
                    y+=d;
                    d+=10;
                    dir='L';
                    break;
                }
                case 'L':{
                    x-=d;
                    d+=10;
                    dir='D';
                    break;
                }
                case 'D':{
                    y-=d;
                    d+=10;
                    dir='R';
                    break;
                }
            }
            steps--;
        }
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        findPos(n);
    }
}