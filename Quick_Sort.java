
package quick_sort;
import java.util.Scanner;

// to sort in ascending order

public class Quick_Sort {
    
    public static int partition(int a[],int low, int high){
        int p,i,j;
        int temp;
        p=a[low];
        i=low+1;
        j=high;
        while(true){
            while(p>=a[i] && i<high)
                i++;
            while(p<a[j] && j>=low)
                j--;
            if (i<j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else {
                temp=a[low];
                a[low]=a[j];
                a[j]=temp;
                return j;
            }
            
        }
    }
    
    public static void Quick_sort(int a[], int low, int high){
        int s;
        if (low<high){
        s=partition(a,low,high);
        Quick_sort(a,low,s-1);
        Quick_sort(a,s+1,high);
    }}

static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
   
    int n,i;
    System.out.println("Enter the number of items to be sorted:");
    n=input.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements");
    for(i=0;i<n;i++){
        a[i]=input.nextInt();
    }
    Quick_sort(a,0,n-1);
    for(i=0;i<n;i++){
        System.out.print(a[i]+"\t");
    }
    }
    
}
