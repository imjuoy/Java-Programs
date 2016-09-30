import java.io.*;
public class Cases
{
  
   public static void main(String args[]) 
     {
       try
       {
  
   int j=0,i,y,x;
   String[] domain=new String[10];
   char g[];
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the domain in any case");
     
    for(i=0;i<6;i++)
        domain[i]=br.readLine();
    
    while(j<6)
      {
    String temp=domain[j];
    if(Character.isUpperCase(temp.charAt(0)))
              {
            System.out.println(domain[j]);
               j++;
               }
    else
     {
      temp=domain[j];
      g=temp.toCharArray();
      y=g.length;
      for(x=0;x<y;x++)
         {
      if(x==0)
          g[x]=Character.toUpperCase(g[x]); 
      System.out.print(g[x]);
       } 
      System.out.println("\n");	   
      j++;
       }
      }
     }
     
    catch(IOException e)
      {
    System.out.println("kahan bhagega");}    
}
}