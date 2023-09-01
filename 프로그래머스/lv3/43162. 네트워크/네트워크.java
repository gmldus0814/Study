class Solution {
    static boolean visit[]; //모든 배열이 false로 만들어짐
    public int solution(int n, int[][] computers) {
        visit = new boolean[n];
        int answer = 0;

        for(int i=0; i<n; i++){
            if(visit[i] == false){
                answer++;
                dfs(i, computers);
            }
        }
        return answer;
    }
    public static void dfs(int index, int[][] computers){
        visit[index] = true;

        for(int i=0; i<computers.length; i++){
            if(visit[i] == false && computers[index][i] == 1){
                dfs(i, computers);
            }
        }
    }
}