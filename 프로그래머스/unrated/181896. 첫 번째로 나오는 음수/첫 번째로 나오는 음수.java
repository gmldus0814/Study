class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int count = 0;
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] < 0){
                answer += i;
                break;
            }
            if(num_list[i] > 0){
                count ++;
            }
            if (count == num_list.length-1){
                answer = -1;
            }
        }
        return answer;
    }
}