package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionForDJ {
    static int v=0;
    
    static int minDistance(int[] dist, boolean[] spt){
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for(int i=0; i<=v; i++){
            if(!spt[i] && dist[i]<=min){
                min = dist[i];
                min_index = i;
            }
        }
        return min_index;
    }
    
    static void printSolution(int []dist, int v,int s){
        for(int i=1;i<=v;i++){
        	if(i == s) {
        		
        	}
        	else if(dist[i] == Integer.MAX_VALUE) {
        	System.out.print(-1);
        	System.out.print(" ");
        	}
        	else {
            System.out.print(dist[i]);
            System.out.print(" ");
        	}
        }
        System.out.println("");
     
        
         }
    static void shortestPath(int[][] adj,int s){
        int []dist = new int[v+1];
        boolean []spt = new boolean[v+1];
        for(int i = 0;i<=v;i++){
            dist[i] = Integer.MAX_VALUE;
            spt[i] = false;
        }
        dist[s] = 0;
        for(int count = 0; count<v-1; count++){
            int u = minDistance(dist, spt);
            spt[u] = true;
            for(int l=0; l<=v;l++){
                if(!spt[l] && adj[u][l] !=0 && dist[u] != Integer.MAX_VALUE && (dist[u]+adj[u][l]< dist[l])){
                    dist[l] = dist[u] + adj[u][l];
                }
            }
        }
        printSolution(dist,v,s);
    }
     

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int [][] adj1 = new int[10][10];
    	Scanner sc = new Scanner(System.in);
        int numberOfTestCase = sc.nextInt();
        
        
        for(int o=0;o<numberOfTestCase;o++){
            int noOfNodes = sc.nextInt();
            v  = noOfNodes;
            int noOfEdges = sc.nextInt();
            int adj[][] = new int[noOfNodes+1][noOfNodes+1];
            for(int i=0;i<=noOfNodes;i++){
                for(int j=0;j<=noOfNodes;j++){
                    adj[i][j]  = 0;
                }
            }
            for(int j=0; j<noOfEdges; j++){
                int startNode = sc.nextInt();
                int endNode = sc.nextInt();
                adj[startNode][endNode] = 6;
            }
            String startPosition = sc.next();
            int startPositionInt = Integer.parseInt(startPosition);
            
            shortestPath(adj, startPositionInt);
           
            
        }
    }
}