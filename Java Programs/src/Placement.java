import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class Placement

  {   
  public static void main(String args[]) throws IOException
          {

           try

             {

     int i,j=0,k=0,l,n,y=0;
      char g[];     
     String[] name= new String[6];
     
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Scanner input = new Scanner( System.in ); 

    
          
        System.out.println("Enter the name of 5 consultants");
          for(i=0;i<=5;i++)
             {
            name[i]=br.readLine();
             }
    
      System.out.println("Enter the string number to change"); 
             String q=br.readLine();
             int p=Integer.parseInt(q);
             if(p<6){ 
             String temp=name[p];
	     g=temp.toCharArray();
             y=g.length;
                                     
                                            
     System.out.println("Enter the position to change");
              l=input.nextInt();
     System.out.println("Enter the letter to replace"); 
              String f=br.readLine();
              char h=f.charAt(0);
                  if(l<=y-1)
                     {
                     g[l]=h;
                     }
     System.out.println("The changed name is:");
                 for(n=0;n<y;n++)                                           
    System.out.print(g[n]);
                     }  }       
              
          catch(IOException e)
            { 
              System.out.println("pakad liya");
              }
            
         
             
         }
       }