
    class heap
{
    int arr[]=new int[10];
    int size=0;

    int getParentIndex(int i)
    {
        return (i-1)/2;

    }
    int getLeftChildIndex(int i)
    {
        return (2*i+1);

    }
    int getRightChildIndex(int i)
    {
        return (2*i+2);

    }
    boolean hasParent(int i)
    {
        // if(getParentIndex(i)<0) return false;
        // return true;
        return getParentIndex(i)>=0; //another method for code beautify

    }
    boolean hasLeftChild(int i)
    {
        return getLeftChildIndex(i)<size;
    }
    boolean hasRightChild(int i)
    {
        return getRightChildIndex(i)<size;
    }
    int parent(int i)
    {
        // return arr[(i-1)/2];
        return arr[getParentIndex(i)];
    }
    int LeftChild(int i)
    {
        return arr[getLeftChildIndex(i)];
    }
    int RightChild(int i)
    {
        return arr[getRightChildIndex(i)];
    }
    int size()
    {
        return size;
    }
    boolean isEmpty()
    {
         return size<=0; //or size==0;
    }
    int peek()
    {
        return arr[0]; //root return highest priority

    }
    void insert(int val)
    {
        arr[size]=val;
        size++;
        HeapifyUp();
    }
    void HeapifyUp()
    {
        int i=size-1;
        while(hasParent(i) && parent(i)<arr[i])
        {
            swap(i,getParentIndex(i)); 
            i=getParentIndex(i);

        }
    }
    void swap(int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    void print()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    int poll()
    {
        int val=arr[0];
        arr[0]=arr[size-1];
        size--;
        HeapifyDown();
        return val;
    }
    void HeapifyDown()
    {
        int i=0;
     while(hasLeftChild(i))
    {
        int greaterChildIndex=getLeftChildIndex(i);
        if(hasRightChild(i) && RightChild(i)>LeftChild(i))
        {
            greaterChildIndex=getRightChildIndex(i);
        }
        if(arr[i]<arr[greaterChildIndex])
        {
            swap(i,greaterChildIndex);
        }
        else
        {
            break;
        }
        i=greaterChildIndex;
    }

    }
    void sort()
    {
        while(size!=1)
        {
            int temp=arr[0];
            arr[0]=arr[size-1];
            arr[size-1]=temp;            
            size--;
            HeapifyDown();
        }
    }

}
class HeapSort
{
    public static void main(String[] args) {
        
        heap h=new heap();
        h.insert(10);
        h.insert(5);
        h.insert(3);
        h.insert(2);
        h.insert(7);
        h.print();
        h.sort();
        System.out.println();
        h.print();

    }
}