
import java.util.Scanner;

public class CollectingBalls {
    static int maxBallsCollected(int[] roadA,int[] roadB,int n,int m){
        int collected=0;
        int idxA=0,idxB=0,collA=0,collB=0;
        while(idxA < roadA.length && idxB < roadB.length){
            while(idxA+1 < n && roadA[idxA] == roadA[idxA+1])
                collA += roadA[idxA++];
            while(idxB+1 < m && roadB[idxB] == roadB[idxB+1])
                collB += roadB[idxB++];
            if(roadA[idxA] == roadB[idxB]){
                collected = collected + Math.max(collA,collB) + roadA[idxA];
                collA = collB = 0;
                idxA++;
                idxB++;
            }
            else if(roadA[idxA] < roadB[idxB]){
                collA += roadA[idxA++];
            }
            else{
                collB += roadB[idxB++];
            }
        }
        while(idxA < n)
            collected += roadA[idxA++];
        while(idxB < m)
            collected += roadB[idxB++];

        return collected;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] roadA = new int[n];
        int[] roadB = new int[m];
        for (int i=0;i<n;i++){
            roadA[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            roadB[j]=sc.nextInt();
        }

        System.out.println(maxBallsCollected(roadA, roadB ,n , m));
    }
}
