import java.util.Arrays;
import java.util.Scanner;
public class arrayfreq {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n =sc.nextInt();
        int arr[]=new int[n];
        int dup[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            dup[i]=-1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    //eg 1 2 1 array hai toh vo ek baar 1 ko 2 baar count krega,2 ko 1 baar,aur 1 v dubara1 count krega....
                    //aisa naa krne ke liye we write next statement
                    dup[j]=0;
                }
            }
            //ek Element array mein kitni baar aarha.
            if(dup[i]!=0)
            {
                dup[i]=count;
            }
        }
        System.out.println("frequency of each elelemnt is");

           for(int i=0;i<n;i++)
           {
               if(dup[i]!=0)
               {
                   System.out.println(arr[i]+" comes "+dup[i]+" times");
               }
           }
           // method 2

           int max = arr[0]; 
           System.out.println("2nd method");
        
         for (int i = 1; i < arr.length; i++) 
         {
             if (arr[i] > max) 
                 max = arr[i]; 
         }
         int temp[]=new int[max+1];

         for(int j=0;j<n;j++)
         {
            temp[arr[j]]++;
         }
         for(int i=0;i<n;i++)
         {
             if(temp[arr[i]]>0)
             {
                System.out.println(arr[i]+" comes "+temp[arr[i]]+" times");
                temp[arr[i]]=0;

             }
         }

         //method 3 hashmap
         System.out.println("3rd method");

         java.util.HashMap<Integer,Integer> h=new java.util.HashMap<>();

         for(int i=0;i<n;i++)
         {
             if(h.containsKey(arr[i]))
             {
                 h.put(arr[i],h.get(arr[i])+1);
             }
             else
             {
                 h.put(arr[i],1);
             }

         }
         for (int i : h.keySet()) {
            System.out.println("key: " + i + " value: " + h.get(i));
          }


    }
}