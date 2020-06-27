import java.util.*;

class itnearyTicket {
public static void main(String[] args) 
{
    Scanner in = new Scanner(System.in); 
    int n = in.nextInt(); 
   Map<String, String> tickets = new HashMap<String, String>(); 
    for(int i = 0; i < n; i++) 
    { 
       tickets.put(in.next(), in.next());
        in.nextLine();
    } 
     Map<String, String> rev = new HashMap<String, String>(); 
     //rev map
        for(String e : tickets.keySet()) 
        { 
            rev.put(tickets.get(e),e); 
        } 
        for(String s : rev.keySet()) 
         { 
             System.out.print(s+" "+rev.get(s)); 
         }
          String s=null; 
          for(String e : tickets.keySet())
           { 
               if(!rev.containsKey(e)) 
               { 
                   s=e; 
                   break; 
                } 
            }  
            if(s==null) 
            { 
               System.out.println("Invalid"); 
               return; 
            }
         System.out.print(s+" "); 
         String to=tickets.get(s);
          while(to!=null) 
          { 
              System.out.print(to+" "); 
              to=tickets.get(to); 
          } 
    }

}