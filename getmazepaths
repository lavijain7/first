
//1. You are given a number n and a number m representing number of rows and columns in a maze.
//2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
//3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
//Use sample input and output to take idea about output.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String>ans=getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);
        System.out.println();

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr==dr && sc==dc){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        
        
        
        ArrayList<String>ans=new ArrayList<>();
        
        if(sc+1<=dc){
        ArrayList<String>b=getMazePaths(sr,sc+1,dr,dc);
        for(int i=0;i<b.size();i++){
            ans.add("h"+b.get(i));
        }
        }
       if(sr+1<=dr){
        ArrayList<String>a=getMazePaths(sr+1,sc,dr,dc);
        for(int i=0;i<a.size();i++){
            ans.add("v"+a.get(i));
        }
        }
        
        
        
        return ans;
    }

}





//input  2 2 
//output [hv, vh]
