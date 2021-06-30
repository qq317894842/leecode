package com.example.leecode;

/**
 * @Auther: HuangRui
 * @Date: 2021/6/24 11:11
 * @Description:
 */
public class Topic_149 {
    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        Topic_149 t = new Topic_149();
        int result = t.maxPoints(points);
        System.out.println(result);
    }

    public int maxPoints(int[][] points) {
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            int[] startNode = points[i];
            for (int k=0;k<points.length ;k++ ) {
                int[] endNode = points[k];
                int tempMax = 2;
                double tan = countTan(startNode, endNode);
                for (int j = 0; j < points.length; j++) {
                    endNode = points[j];
                    double nextTan = countTan(startNode, endNode);
                    if (nextTan == tan) {
                        tempMax++;
                    }
                }
                max = tempMax > max ? tempMax : max;
            }
        }
        return max;
    }

    private double countTan(int[] startNode, int[] endNode) {

        return (endNode[0] - startNode[0]) == 0 ? Math.abs((Double.valueOf(endNode[0]) - Double.valueOf(startNode[0])) / (Double.valueOf(endNode[1]) - Double.valueOf(startNode[1]))) :
                Math.abs((Double.valueOf(endNode[1]) - Double.valueOf(startNode[1])) / (Double.valueOf(endNode[0]) - Double.valueOf(startNode[0])));
    }
}
