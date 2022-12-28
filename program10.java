
import java.util.Scanner;

public class program10 {
    //write the jva programme to find the sum of ll elements present in an array
    public void array1(int[] arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of array is:"+sum);
    }

    //write the java programme to find the sum of all  index values present in an array
    public int array2(int[] arr){
        return arr.length;
    }

    //write the java programme to find the sum of all even index elements present in an array
    public int array3(int[] arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            if( i%2==0){
                sum=sum+arr[i];

            }
        }
        return sum ;
    }

    //write the java programme to find the sum of all odd index elements present in an array
    public int array4(int[] arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            if( i%2==1){
                sum=sum+arr[i];

            }
        }
        return sum ;
    }
    //write the java programme to find the product of all the elements of all elements in an array
    public int array5(int[] arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum*arr[i];
        }
        return sum ;
    }
    //write the java program to find the average of all the elements in an array
    public int array6(int[] arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        sum=sum/arr.length;
        return sum ;
    }
    //write the java programme to print the array elements in the reverse order
    public int[] array7(int[] arr){
        int[] arr1=new int[arr.length];
        int e= arr.length-1;

        for(int i=0;i<=arr.length-1;i++){
            arr1[i]=arr[e-i];
        }

        return arr1 ;
    }
    //write the java program to find the largest element in an array
    public int maximumvalue(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //write the java program to find the smallest element in an array
    public int minimumvalue(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int a = sc.nextInt();
        int[] arr= new int[a];
        System.out.println("Enter the elements of an array");
        for(int j=0;j<=arr.length-1;j++){
            arr[j]=sc.nextInt();
        }
        program10 pg =new program10();
        pg.array1(arr);
        System.out.println("arr length"+ pg.array2(arr));
        System.out.println("the sum of even index are "+pg.array3(arr));
        System.out.println("the sum of odd index are "+pg.array4(arr));
        System.out.println("the product of an array " +pg.array5(arr));
        System.out.println("the average of an array " +pg.array6(arr));
        System.out.println("reverse of given array "+ pg.array7(arr));
        System.out.println("maximuon element in an array "+ pg.maximumvalue(arr));
        System.out.println("minimum element in an array "+ pg.minimumvalue(arr));

    }
}
