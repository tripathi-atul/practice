package hackerrank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class SolutionForgraph2 {
	private LinkedList<Integer> arr[];
	
	public static void main(String[] args){
		LinkedList<Integer> arr[];
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    for (int a0 = 0; a0 < t; a0++) {
	        int noOfNodes = in.nextInt();
	        int noOfEdges = in.nextInt();
	        arr = new LinkedList[noOfNodes];
	        for(int i = 0; i <= noOfNodes; i++){
	        	arr[++i] = new LinkedList<Integer>();
	        }
	      
	        for (int i = 0; i < noOfEdges; i++) {
	            int a = in.nextInt();
	            int b = in.nextInt();
	            arr[a].add(b);
	        }
	        int startIndex = in.nextInt();
	        
	    System.out.println("");
	    }
		}
	//For each of  test cases, print a single line consisting of  
		//space-separated integers, denoting the shortest distances of the N-1 nodes 
		//from starting position . This will be done for all nodes same as in the order of
		//input 1 to N.
		
		void BFS(int s, int v, LinkedList[] arr){
			boolean visited[] = new boolean[v];
			LinkedList<Integer> queue = new LinkedList<Integer>();
			visited[s] = true;
			queue.add(s);
			while(queue.size()!=0){
				s = queue.poll();
				System.out.println(s);
				Iterator<Integer> i = arr[s].iterator();
				while(i.hasNext()){
					int adElement = i.next();
					if(visited[adElement] == false){
						queue.add(adElement);
						visited[adElement] =true;
					}
				}
				
			}
		}
		
		int getAdjacentVertex(int v,int [][]arr){
			int j = 0;
			for(int i = 0; i< v; i++){
				if(arr[i][j] != -1){
					return j;
				}
				else 
					return -1;
			}
			
			
			return -1;
		}
		

}
