import java.util.*;
class sumJaggedArr
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[2][];
        int arr1[][]=new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[2]; 
        arr1[0] = new int[3];
        arr1[1] = new int[2];
        
        for (int i=0; i<arr.length; i++) 
        {
            for(int j=0; j<arr[i].length; j++) 
            {
                arr[i][j] = sc.nextInt(); 
            }
        }
        for (int i=0; i<arr1.length; i++) 
        {
            for(int j=0; j<arr1[i].length; j++) 
            {
                arr1[i][j] = sc.nextInt(); 
            }
        }

        System.out.println("Contents of 2D Jagged Array 1"); 
        for (int i=0; i<arr.length; i++) 
        { 
            for (int j=0; j<arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 
        System.out.println("Contents of 2D Jagged Array 2"); 
        for (int i=0; i<arr1.length; i++) 
        { 
            for (int j=0; j<arr1[i].length; j++) 
                System.out.print(arr1[i][j] + " "); 
            System.out.println(); 
        } 
        System.out.println("Sum of 2D Jagged Array's");
        if(arr.length==arr1.length)
        {
            int add[][]=new int[2][];
            add[0] = new int[3];
            add[1] = new int[2]; 
            for (int i=0; i<add.length; i++) 
            { 
                for (int j=0; j<add[i].length; j++) 
                {
                    add[i][j]=arr[i][j]+arr1[i][j];
                    System.out.print(add[i][j] + " "); 
                    
                }
                System.out.println(); 
            } 

        }
        else
        {
            System.out.println("NOT POSSIBLE");
        }

            // int add[][] = new int[arr.length + arr1.length][];

            // for (int i = 0; i < arr.length; i++)
            // {
            //     add[i] = arr[i];
            // }
            // int j = 0;
            // for (int i = arr.length; i < add.length; i++)
            // {
            //     add[i] = arr1[j++];
            // }

            // System.out.println("Add"); 
            // for (int i=0; i<add.length; i++) 
            // { 
            //     for (int x=0; x<add[i].length; x++) 
            //         System.out.print(add[i][x] + " "); 
            //         System.out.println(); 
            // } 

    }
}