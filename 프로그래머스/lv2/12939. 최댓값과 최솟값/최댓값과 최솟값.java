class Solution {
    public String solution(String s) {
        
		String []arr = s.split(" ");
		
		int n = arr.length;
		
		int []numArr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }
        
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				//가까운 값과 비교해 앞에 있는 값이 더 클 경우 자리 교체
				if(numArr[j]>numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
        String answer = numArr[0]+" "+numArr[arr.length-1];
        return answer;
    }
}