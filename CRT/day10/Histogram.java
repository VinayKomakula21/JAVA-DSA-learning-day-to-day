import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    static int[] findPrevSmall(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int n = arr.length,i;
        int[] pse=new int[n];
        for(i=0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            if(stk.isEmpty())
                pse[i] = -1;
            else{
                pse[i] = stk.peek();
            }
            stk.push(i);
        }
        return pse;
    }

    static int[] findNextSmall(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int n = arr.length,i;
        int[] nse = new int[n];
        for(i=n-1;i>=0;i--){
            int curr = arr[i];
            while(!stk.isEmpty() && arr[stk.peek()] >= curr){
                stk.pop();
            }
            if(stk.isEmpty())
                nse[i]=-1;
            else{
                nse[i] = stk.peek();
            }
            stk.push(i);
        }
        return nse;
    }
    
    static int largestRectangleArea(int[] arr){
        int n=arr.length;
        int[] nse = new int[n];
        int[] pse =new int[n];

        pse = findPrevSmall(arr);
        nse = findNextSmall(arr);

        int ans = Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {
            if(nse[i] == -1)
                nse[i] = arr.length;
            int h = arr[i];
            int l = nse[i] - pse[i] -1;
            
            ans = Math.max(ans,l*h);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(largestRectangleArea(arr));
    }
}
