import java.util.*;
public class linearSearch {
    public static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i
            }
        }
        return -1
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int a=sc.nextInt();
        int arr[]=new int [a];
        System.out.println("enter the element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key");
        int key=sc.nextInt();
       int index= linear(arr, key);
        if(index==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at index "+index);
        }
    }
}
