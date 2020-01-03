import java.util.*;

class lengthyWordfromList
{
    static public String longestWord(String words[])
    {
        Set<String> set=new HashSet<String>();
        Arrays.sort(words);
        String result="";
        for(String word:words)
        {
            if(word.length()==1 || set.contains(word.substring(0,word.length()-1)))
            {
                if(word.length()>result.length())
                {
                result=word;
                }
                set.add(word);
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        String x=longestWord(arr);
        System.out.print("Answer: "+x);

    }
}


// 7
// a
// banana
// app
// appl
// ap
// apply
// apple
// Answer: apple