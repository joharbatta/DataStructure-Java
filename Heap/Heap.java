import java.util.*;
//heap implementation using arraylist
public class Heap
{
    ArrayList<Integer> data;
    public Heap()
    {
        data=new ArrayList<Integer>();
        data.add(null);    //0 index has null  starting adding from 1 index
    }

    public void insert(int priority)
    {
        data.add(priority);   //add
 
        int childIndex=data.size()-1;  //getting index
        int parentIndex=childIndex/2;  //getting parent of new

        while(childIndex!=-1 && parentIndex!=0)
        {
            if(data.get(childIndex)>=data.get(parentIndex))
            {
                break;
            }
            int childData=data.get(childIndex);
            int parentData=data.get(parentIndex);

            data.set(childIndex,parentData);  //swap
            data.set(parentIndex,childData);
            childIndex=parentIndex;  //new index
            parentIndex=childIndex/2;

        }
    }

    public int getMin()
    {
        if(getSize()==0)
        {
            return -1;
        }
        return data.get(1);
    }
    public int getSize()
    {
        return data.size()-1;   
    }

    // if we have to remove min ek option h remove kro sara elememts shift kro but o(N) time complexity hogi
    // 2nd hum krenga ki first ko last de replace last remove and again setting krlemga O(logn) me hojayega

    public int removeMin()
    {
        int min=data.get(1);   //first
        int last=data.get(data.size()-1); //last
        data.set(1,last);    //swap
        // data.set(data.size()-1,min); // or isko na hi kro 1 set hogya bs last apne aap hojega
        data.remove(data.size()-1); //remove last now which is first that we swapped

        int currentIndex=1;
        int leftChildIndex=2*currentIndex;
        int rightChildIndex=2*currentIndex+1; 

        while(leftChildIndex<data.size()-1)
        {
            int minIndex=currentIndex;
            int currentData=data.get(currentIndex);
            int leftData=data.get(leftChildIndex);
            int rightData=data.get(rightChildIndex);

            if(leftData<currentData)
            {
                minIndex=leftChildIndex;
            }
            if(rightChildIndex<data.size())
            {
                if(rightData<data.get(minIndex))
                {
                    minIndex=rightChildIndex;
                }   
            }
            if(minIndex==currentIndex)  //agar zarurat nhi aage
            {
                break;
            }
            data.set(currentIndex,data.get(minIndex));
            data.set(minIndex,currentData);
            currentIndex=minIndex;
            leftChildIndex=2*currentIndex;
            rightChildIndex=leftChildIndex+1;

        }
        return min;

    }

    public static void main(String[] args) 
    {
        
        Heap p=new Heap();
        p.insert(11);
        p.insert(15);
        p.insert(10);
        p.insert(14);
        p.insert(21);
        System.out.println(p.getMin());  //min
        System.out.println(p.removeMin()); //remove
        System.out.println(p.getMin());  //again min

    }

}
