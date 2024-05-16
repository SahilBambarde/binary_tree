public class Main1 {
    // Reverse an array
    public static void main(String agrs[]){
        int[] a ={0,1,3,4,5,6};
        a = reverse(a);
        for(int i: a){
            System.out.print(i+" ");
        }

    }

    static int[] reverse(int[] a){
        int i = 0;
        int j =  a.length-1;
        while(i<j && i!=j){
            int x = a[i];
            a[i]=a[j];
            a[j]=x;
            i++;
            j--;
        }
        return a;
    }
}
