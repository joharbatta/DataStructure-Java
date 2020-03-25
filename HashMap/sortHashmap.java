import java.util.*;

class sortHashMap
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i : map.keySet())
        {
            System.out.println(i+"--"+map.get(i));
        }
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() 
        { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                //return (o1.getValue().compareTo(o2.getValue())); 
                return o1.getValue()-o2.getValue();
            } 
        }); 


        
            System.out.println(list);
            Collections.reverse(list);
            System.out.println(list);

            List<Integer> list1 = new LinkedList<>(map.keySet());

            Collections.sort(list1, new Comparator<Integer>() 
            { 
                public int compare(Integer o1,Integer o2) 
                { 
                    //return (o1.getValue().compareTo(o2.getValue()));
                    //for key sort 
                    return o1-o2;
                    //if -1 then less o1 than o2 0 zero 1 greator
                    // at time of soting values swap according to this result
                    //for values sort
                    //return map.get(o1)-map.get(o1);
                } 
            }); 
            System.out.println(list1);
            HashMap<Integer,Integer> map1=new HashMap<>();

            for(int i : list1)
            {
                map1.put(i,map.get(i));
            }
            System.out.println(map1);

           


        
    }
}