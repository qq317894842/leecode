package com.example.leecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: HuangRui
 * @Date: 2021/1/19 10:16
 * @Description:
 */
public class Topic_1584 {
    class Edge{
        int a,b,val;
        public Edge(int a,int b,int val){
            this.a = a;
            this.b = b;
            this.val = val;
        }
    }

    public int find(int n){
        if(p.get(n)!=n){
            p.set(n,find(p.get(n)));
        }
        return  p.get(n);
    }

    List<Integer> p;
    public int minCostConnectPoints(int[][] points) {
        p = new ArrayList<>();
        int n = points.length;
        for(int i=0;i<n;i++){
            p.add(i);
        }
        List<Edge> edges = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                edges.add(new Edge(i,j,Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1])));
            }
        }
        Collections.sort(edges,(a,b)->a.val-b.val);
        int res = 0;
        for(Edge e : edges) {
            // 查找这条边两个端点所处的集合根元素
            int a = find(e.a), b = find(e.b);
            // 如果这两条边不是一个集合的，那么就添加这条边
            if(a != b) {
                // 并且将这两个点所在的集合根元素加入一个集合
                p.set(a, b);
                // 答案中添加这条边长度
                res += e.val;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Topic_1584 topic_1584 = new Topic_1584();
        int[][] points = new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}};
        int sum = topic_1584.minCostConnectPoints(points);
        System.out.println(sum);
    }
}
