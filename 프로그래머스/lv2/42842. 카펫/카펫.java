class Solution {
    public int[] solution(int brown, int yellow) {
        
        int sum = brown + yellow;
    	int width = 0;
    	int hight = 0;
    	int[] answer = new int[2];
    	
        for(int i = 1; i<sum; i++) {
        	if(sum%i == 0) {
        		if(sum/i >= 3 && i >= 3) {
            		width = i;
        			hight = sum/i;
        			if((width-2)*(hight-2) == yellow) {
            			answer[0] = width;
            			answer[1] = hight;
        			}
        		}
        	}
        }

        return answer;

    }
}
