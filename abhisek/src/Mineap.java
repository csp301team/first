import java.io.File;
import java.io.IOException;
import java.util.Scanner;


class Node
   {
        double arr;
    double time;            


    public Node(double first, double last)
    {
        arr = first;
        time = last;
    }

   public double gettime()
      { return time; }
   public double getarr()
      {
          return arr;
      }

   public void settime(double id)
      { time = id+4.; }
   
   public void setarr(double id)
   { arr = id; }

   
   public static String toString(Node a)
   {
       return "("+"arr" + " "  + "time"+")";
   }

   }

  


   class MinHeap {
    private Node[] Heap;
    private int maxsize;
    private int size;

    public MinHeap(int max) {
        maxsize = max;
        Heap = new Node[maxsize];
        size = 0 ;
        Heap[0] = null;
    }

   public int len(){
           return size;
   }
   public Node[] geth(){
           return Heap;
   }
   
  
    public void insert(Node key)
    {  
    Heap[size] = key;
    shiftu(size++);
   
    }  
 public void shiftu(int index)
    {
    int parent = (index-1) / 2;
    Node bottom = Heap[index];

    while( index > 0 &&
           Heap[parent].gettime() > bottom.gettime() )
       {
       Heap[index] = Heap[parent];  
       index = parent;
       parent = (parent-1) / 2;
       } 
    Heap[index] = bottom;
    } 
 
 
 
    public void print()
    {
    System.out.print("Heap: ");    
    for(int m=0; m<size; m++)
       if(Heap[m] != null)
          System.out.print( "("+ Heap[m].getarr()+","+ Heap[m].gettime()+")" + " ");
       else
          System.out.print( "-- ");
    System.out.println();
                                        
  
    } 
    public  void min(Node n){
                  
            Heap[0]=n;
    
    }
  
 
   public Node remove()       
   
   {   
           Node root = Heap[0];
                  size--;               
              
              Heap[0] = Heap[size];
              shiftd(0);
  return root;
   
              }  
   
           public void shiftd(int index)
              {
              int minchild;
              Node top = Heap[index];      
              while(index < size/2)      
                 {                               
                 int leftChild = 2*index+1;
                 int rightChild = leftChild+1;
                                                 
                 if(rightChild < size &&  
                                     Heap[leftChild].gettime() <
                                     Heap[rightChild].gettime())
                 { minchild = leftChild;}
                 else if(rightChild >= size) {minchild = leftChild;}
                 else
                 { minchild = rightChild;}
                                    
                
                 if( top.gettime() >= Heap[minchild].gettime() )        
                 { Node t=Heap[index];
                 Heap[index]=Heap[minchild];
                 Heap[minchild]=t;
              
                 }
                 
          
              index=minchild;
              }  
           
          
   }
   }
   
   
   
   
  public class Mineap
   { 
          
         
     
          
public static void process( Node[] abh){
                        
                        MinHeap the=new MinHeap(abh.length);
                       double finaltime=0;
                        double currenttime=abh[0].getarr();
                        for(int k=0;k<=abh.length-1;k++){
                      
                                if(k==abh.length-1){
                                         while((currenttime<abh[k].getarr())&&(the.geth().length>0)){
                                         Node[] a=the.geth();
                                         
                                        
                                         
                                         
                                                double job=abh[k].getarr()-currenttime;
                                         if(job<a[0].gettime()){
                                                 currenttime=abh[k].getarr();
                                                 the.min(new Node(a[0].getarr(),((a[0]).gettime()-job)));
                                         }else{ 
                                        	 
                                        	 if(the.len()>0){
                                                 Node f=  the.remove();
                                             System.out.println("the  flow     time  of");System.out.println(f.getarr());System.out.print("  is");
                                             System.out.println(currenttime-f.getarr()+f.gettime());
                                             
                                             
                                               finaltime+=currenttime-f.getarr()+f.gettime();
                                               
                                             currenttime=currenttime+f.gettime();
                                        
                                                 
                                         }}}
                                         
                                         
                                         currenttime=abh[k].getarr();
                              the.insert(abh[k]);
                              
                              
                           
                              
                                       
                                                                
                                        while(the.len()>0){
                                Node        s=the.remove();
                              
                                                System.out.println(" the     flow    time   of");
                                                System.out.print(s.getarr());
                                                System.out.print("   iss");
                                                System.out.println(currenttime+s.gettime()-s.getarr());
                                               
                                finaltime+=currenttime+s.gettime()-s.getarr(); 
                                currenttime=currenttime+s.gettime();
                                                }
                                      
                                        
                                
                                
                                                
                                        }
                                
                                
                                else{
                                while((currenttime<abh[k].getarr())&&(the.geth().length>0)){
                                Node[] a=the.geth();
                                
                               
                                
                                
                                       double job =abh[k].getarr()-currenttime;
                                if(job<a[0].gettime()){
                                        currenttime+=job;
                                        the.min(new Node(a[0].getarr(),(a[0].gettime()-job)));
                                }else{
                                        if(the.len()>0){
                                         Node f=  the.remove();
                                     System.out.println("the flow   time of");System.out.println(f.getarr());System.out.print(" il");
                                     System.out.println(currenttime-f.getarr()+f.gettime());
                               finaltime+=currenttime-f.getarr()+f.gettime();
                                     currenttime=currenttime+f.gettime();}
                                        else{
                                        	currenttime=abh[k].getarr();
                                        }
                                
                                        
                                }}
                                
                               
                                the.insert(abh[k]);
                                Node[] a=the.geth();
                                currenttime=abh[k].getarr();
                                                                
                                      double job =abh[k+1].getarr()-currenttime;
                             
                                        if(a[0].gettime()>job){
                                              the.min(new
Node(a[0].getarr(),((a[0]).gettime()-job)));
                                             currenttime+=job;
                                                
                                        }
                                        else{
                                        
                                                Node s=the.remove();
                                             
                                                System.out.println("the flow time  of");System.out.println(s.getarr());System.out.print("  is");
                                                System.out.println(currenttime-s.getarr()+s.gettime());
                                                finaltime+=currenttime-s.getarr()+s.gettime();
                                                currenttime=currenttime+s.gettime();
                                                
                                }}
                                
                                        
                                }
                        System.out.println("the total flow time of all the jobs");
                        System.out.print(finaltime);
                

                                
                        }
                                
                                
                        
                          
          
          
     
          
          
          
          
          
          
          
          
           public static void main(String[] args) 
   {
           
                
                           
                           Node []q1= new Node[500];
                    	   String word="";
                    	 

                    	   File file=new File("xyz.txt");
                    	   try{
                    	   Scanner input = new Scanner(file);
                    	   int pos=0;
                    	   while(input.hasNext())
                    	   {  word=input.next();
                    	   q1[pos]=new Node(Double.parseDouble(word.substring(word.indexOf('(')+1, word.indexOf(','))), Double.parseDouble(word.substring(word.indexOf(',')+1, word.indexOf(')'))));
                      	 
                    	   
                    	  
                    	   pos++;
                    	   }}
                    	   catch(IOException e){System.out.println(e);}
                    	  
                   
                          
                        process(q1);
                        
                
                          
        
                    	   }}  
        



