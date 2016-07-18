package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DJ2 {
	
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	       int v=sc.nextInt();
	       //Queue<Integer> queue=new LinkedList<Integer>();
	        int[] actualArray=new int[v];   
	         int[] array =new int[v];
	       for(int k=0;k<array.length;k++){
	           array[k]=-1;
	       }  
	       Map<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
	       int m=sc.nextInt();
	       for(int w=0;w<m;w++){
	        int key=sc.nextInt();   
	        if(map.containsKey(key)){
	         List<Integer> list=map.get(key);
	         list.add(sc.nextInt());   
	         map.put(key,list);   
	        }else{
	            List<Integer> l=new ArrayList<Integer>();
	            l.add(sc.nextInt());
	            map.put(key,l);
	        }

	       } 
	        int source=sc.nextInt();
	        List<Integer> kl=map.get(source);
	        array[source-1]=-1;
	        for(int o=0;o<kl.size();o++){
	            array[kl.get(o)-1]=6;//distance array
	        }
	        for(int ip=0;ip<array.length;ip++){
	            if(array[ip]!=0){
	             int temp=array[ip];   
	             List<Integer> lot=map.get(ip);

	             if(lot!=null && lot.isEmpty()){
	             for(Integer result:lot){
	                 if(result!=-1){
	                   if(array[result-1]>temp+6)  
	                   array[result-1]=temp+6;  
	                                        }

	             } 
	             }      
	            }

	        }
	        //System.out.println(array[0]);
	        for(int rs=0;rs<array.length;rs++){
	                if(rs!=source-1)    
	               System.out.print(array[rs]+" ");




	        }
	        System.out.println(" ");
	    }//text case end

	}

}
