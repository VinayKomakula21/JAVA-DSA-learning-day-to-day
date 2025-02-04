
import java.util.Scanner;
import java.util.Stack;

public class PrevGreaterElement {
    static void greaterElementsBrute(int[] arr){
        int[] greatArr = new int[arr.length];
        int n = arr.length;
        int j,i;
        greatArr[0] = -1;
        for(i=1;i<n;i++){
            for(j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    greatArr[i]=arr[j];
                    break;
                }
            }
            if(j == -1)
                greatArr[i] = -1;
        }
        for(int item:greatArr){
            System.out.print(item+" ");
        }
    }
    static void prevGreatElementsStack(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int n = arr.length,i;
        for(i=0;i<n;i++){
            while(!stk.isEmpty() && stk.peek() < arr[i]){
                stk.pop();
            }
            if(stk.isEmpty())
                System.out.print(-1+" ");
            else{
                System.out.print(stk.peek()+" ");
            }
            stk.push(arr[i]);
        }
    }
    static void prevSmallElementsStack(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int n = arr.length,i;
        for(i=0;i<n;i++){
            while(!stk.isEmpty() && stk.peek() > arr[i]){
                stk.pop();
            }
            if(stk.isEmpty())
                System.out.print(-1+" ");
            else{
                System.out.print(stk.peek()+" ");
            }
            stk.push(arr[i]);
        }
    }

    static void nextGreatElementsStack(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int n = arr.length,i;
        int[] ans = new int[n];
        for(i=n-1;i>=0;i--){
            int curr = arr[i];
            while(!stk.isEmpty() && stk.peek() < curr){
                stk.pop();
            }
            if(stk.isEmpty())
                ans[i]=-1;
            else{
                ans[i] = stk.peek();
            }
            stk.push(curr);
        }
        for(int item:ans){
            System.out.print(item+" ");
        }
    }

    static void nextSmallElementsStack(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int n = arr.length,i;
        int[] ans = new int[n];
        for(i=n-1;i>=0;i--){
            int curr = arr[i];
            while(!stk.isEmpty() && stk.peek() > curr){
                stk.pop();
            }
            if(stk.isEmpty())
                ans[i]=-1;
            else{
                ans[i] = stk.peek();
            }
            stk.push(curr);
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

        nextSmallElementsStack(arr);
    }
}