package DS;

import java.util.Arrays;

public class UnionFind {
    int parent[];
    int rank[];
    UnionFind(int n){
        parent=new int[n+1];
        rank=new int[n+1];
        for(int i=0;i<=n;i++){
            parent[i]=i;
            rank[i]=0;
        }
        System.out.println(Arrays.toString(parent));
        System.out.println(Arrays.toString(rank));
    }
    public static void main(String[] args) {
        UnionFind obj=new UnionFind(5);
    }


}
