package 基礎1;

public class 演習8 {
    public static void main(String[] args) {
    int[] a = {3, 1, 4, 1, 5}; 
    int sum=0;
    int max = a[0];
    for(int i=0; i<a.length; i++) {
        System.out.println(a[i]);
        sum=sum+a[i];
        if(a[i]>max) max=a[i];
    }
    System.out.println(sum);
    System.out.println(max);
    double average = (double)sum / a.length;
    System.out.println(average);
    }
}

    

