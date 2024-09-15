import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        // 각 정점의 나가는 간선과 들어오는 간선 개수를 저장할 Map 생성
        Map<Integer, Integer> outDegree = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();

        // 간선 정보를 기반으로 나가는 간선과 들어오는 간선 개수 집계
        for (int[] edge : edges) {
            outDegree.put(edge[0], outDegree.getOrDefault(edge[0], 0) + 1);
            inDegree.put(edge[1], inDegree.getOrDefault(edge[1], 0) + 1);
        }

        int newNode = -1;
        int donut = 0;
        int bar = 0;
        int eight = 0;

        // 정점별 분석
        for (int node : outDegree.keySet()) {
            int outCount = outDegree.get(node);
            int inCount = inDegree.getOrDefault(node, 0);

            if (outCount > 1) {
                if (inCount == 0) {
                    newNode = node; // 추가 생성 정점
                } else {
                    eight++; // 8자 그래프의 가운데 정점
                }
            }
        }

        // 나가는 간선이 없는 정점 세기
        for (int node : inDegree.keySet()) {
            if (!outDegree.containsKey(node)) {
                bar++; // 막대 그래프의 마지막 정점
            }
        }

        // 추가 생성 정점의 간선 개수 계산
        if (newNode != -1) {
            donut = outDegree.get(newNode) - bar - eight;
        }

        return new int[]{newNode, donut, bar, eight};
    }
}
