import java.util.*;
// a*b=c*d;
// n*n Time complexity
class QuadrupleProduct
{
    static class Pair{
        int first;
        int second;
        public Pair(int first,int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Pair> map=new HashMap<>();
        boolean isFound=false;
        for(int x=0;x<n;x++)
        {
            for(int y=x+1;y<n;y++)
            {
                int productVal=arr[x]*arr[y];

                if(map.containsKey(productVal))
                {
                    isFound=true;
                    Pair p=map.get(productVal); //index store krenga
                    System.out.println(arr[p.first]+" "+arr[p.second]+" "+arr[x]+" "+arr[y]);
                }
                else
                {
                    map.put(productVal,new Pair(x,y));
                }
            }
        }

        if(!isFound)
        {
            System.out.println("Not found");
        }
    }
}

// i/o
// 6
// 1 2 6 3 4 12
// o/p
// 1 12 2 6
// 1 6 2 3
// 2 12 6 4
// 1 12 3 4




// class QuadrupleProduct
// {
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }

//         HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<Integer,HashMap<Integer,Integer>>();
//         HashMap<Integer,Integer> innerMap = new HashMap<Integer,Integer>();   
//         boolean isFound=false;
//         for(int x=0;x<n;x++)
//         {
//             for(int y=x+1;y<n;y++)
//             {
//                 int productVal=arr[x]*arr[y];

//                 if(map.containsKey(productVal))
//                 {
//                     isFound=true;
//                     HashMap<Integer,Integer> p=map.get(productVal); //index store krenga
//                     System.out.println(p.getKey()+" "+p.getValue()+" "+arr[x]+" "+arr[y]);
//                 }
//                 else
//                 {
//                     map.put(productVal,.put(x,y));
//                 }
//             }
//         }

//         if(!isFound)
//         {
//             System.out.println("Not found");
//         }
//     }
// }