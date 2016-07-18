package hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SolutionToGraph {
	
	public static void main(String[] args){
	
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
        int noOfNodes = in.nextInt();
        int noOfEdges = in.nextInt();
        int[][] arr = new int[noOfNodes][noOfNodes];
        for (int i = 0; i < noOfNodes; i++) {
            for (int j = 0; j < noOfNodes; j++) {
                arr[i][j] = -1;
            }
        }
        for (int i = 0; i < noOfEdges; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[--a][--b] = 6;
        }
        int startIndex = in.nextInt();
        
        
        for (int i = 0; i < noOfNodes; i++) {
            if( i != startIndex - 1)
            System.out.print(arr[startIndex-1][i] + " ");
        }
        System.out.println("");
    }
	}
//For each of  test cases, print a single line consisting of  
	//space-separated integers, denoting the shortest distances of the N-1 nodes 
	//from starting position . This will be done for all nodes same as in the order of
	//input 1 to N.
	
	void BFS(int s, int v, int [][]arr){
		boolean visited[] = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while(queue.size()!=0){
			s = queue.poll();
			int nextVertex = getAdjacentVertex(v, arr);
			
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
