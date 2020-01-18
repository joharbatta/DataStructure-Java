import java.util.*;
class ColonyCells
{
    public static int[] result(int cells[],int days)
    {
        int newcells[]=new int[cells.length];
        while(days>0)
        {
            for(int i=0;i<cells.length;i++)
            {
                if(i==0)
                {
                    //edge case
                    if(0==cells[1])  //0 is previous
                    {
                        newcells[i]=0;
                    }
                    else
                    {
                        newcells[i]=1;
                    }
                }
                else if(i==cells.length-1)
                {
                    //edge case
                    if(cells[i-1]==0)  //0 is next
                    {
                        newcells[i]=0;
                    }
                    else
                    {
                        newcells[i]=1;
                    }
                }
                else //in b/w case
                {
                    if(cells[i+1]==cells[i-1])
                    {
                        newcells[i]=0;
                    }
                    else
                    {
                        newcells[i]=1;
                    }
                    
                }
            }
            days--;
            for(int i=0;i<cells.length;i++)
            {
                cells[i]=newcells[i];
            }
        }
        return cells;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cells[]=new int[n];
        for(int i=0;i<n;i++)
        {
            cells[i]=sc.nextInt();
        }
        int days=sc.nextInt();
        System.out.println("BEFORE");
        for(int i=0;i<n;i++)
        {
            System.out.print(cells[i]+" ");
        }
        System.out.println();
        System.out.println("AFTER");
        result(cells,days);
        for(int i=0;i<n;i++)
        {
            System.out.print(cells[i]+" ");
        }
        
    }
}









// Q1. There is a colony of 8 cells arranged in a straight line where each day every cell competes with its adjacent cells (neighbour). Each day, for each cell, if its neighbours are both active and both inactive, the cell becomes inactive the next day, otherwise it becomes active the next day.

// Assumptions: The two cells on the ends have single adjacent cell, so the other adjacent cell can be assumed to be always inactive.
// Even after updating the cell state. Consider its previous state for updating the state of other cells. Update the cell information of all cells simultaneously.
// Write a function cell Compete which takes one 8 element array of integer’s cells representing the current state of 8 cells and one integer days representing the number of days to simulate.
// An integer value of 1 represents an active cell and value of 0 represents an inactive cell.
// TESTCASES 1:
// INPUT:
// [1,0,0,0,0,1,0,0],1
// EXPECTED RETURN VALUE:
// [0,1,0,0,1,0,1,0]


// TESTCASE 2:
// INPUT:
// [1,1,1,0,1,1,1,1,],2
// EXPECTED RETURN VALUE:
// [0,0,0,0,0,1,1,0]