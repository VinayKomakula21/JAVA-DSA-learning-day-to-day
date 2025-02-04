
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    static int findIndex(int[] arr,int ele){
        int n=arr.length,i=0;
        while(i<n && arr[i] != ele)
            i++;
        return i;
    }
    static void StockSpanSi(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int n = arr.length,i;
        int[] ans = new int[n];
        ans[0]=1;
        for(i=1;i<n;i++){
            while(!stk.isEmpty() && stk.peek() < arr[i]){
                stk.pop();
            }
            if(stk.isEmpty())
                ans[i] = i+1;
            else{
                int ele = stk.peek();
                ans[i] = i - findIndex(arr,ele);
            }
            stk.push(arr[i]);
        }
        for(int item:ans){
            System.out.print(item+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        StockSpanSi(arr);
    }
}
