public class Array
  {   
  public static void main(String args[])
          
             {

     int i,j;     
     String[] mylist= new String[args.length];
          for(i=0;i<args.length;i++)
             {
                  mylist[i]=args[i];
                 
             }
                        
              System.out.println(mylist[0].toUpperCase());
              
              for(j=1;j<args.length;j++)
                       System.out.println(mylist[j]);
              
                    

              }
         }