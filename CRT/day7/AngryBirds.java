import java.util.Scanner;

public class AngryBirds{
    static boolean canPlace(int[] nests, int birds, int minDistance) {
        int birdsPlaced = 1;
        int placedAt = nests[0];

        for(int i = 1; i < nests.length; i++) {
            int currentDistance = nests[i] - placedAt;
            if(currentDistance >= minDistance) {
                birdsPlaced++;
                placedAt = nests[i];
                if(birdsPlaced == birds)
                    return true;
            }
        }
        return false;
    }

    static int ABirds(int[] nests,int birds){
        int n=nests.length;
        int answer=0;
        int low=0,high=nests[n-1]-nests[0];
        while(low<=high){
            int mid=(high+low)/2;
            if(canPlace(nests,birds,mid)){
                answer=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int birds=sc.nextInt();

        System.out.println(ABirds(arr, birds));
    }
}
