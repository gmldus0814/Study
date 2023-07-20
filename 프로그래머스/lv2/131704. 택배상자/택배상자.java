import java.util.Stack;

class Solution { // 택배 상자
    public int solution(int[] order) {
        int answer = 0;
        int currentBox = 1; // 트럭에 실어야 할 상자 순서
        Stack<Integer> subCon = new Stack<>();
        
        while(answer < order.length) {
        	
        	//종료조건
        	//만약에 서브컨베이어벨트에 값이 있으면
        	if(!subCon.empty()) {
        		//만약에 택배아저씨가 말한 값보다 컨베이어벨트가 더 크고 예비 컨베이어벨트에 있는 값도 클 때
            	if(order[answer] < currentBox && order[answer] < subCon.peek()) {
            		break;
            	}
        	}
        	
        	//만약에 컨베이어벨트에서 오는 박스 값이 택배아저씨가 말한 값과 같을 때
        	if(currentBox == order[answer]) {
        		answer++;
        		currentBox++;
        		continue;
        	}
        	
        	//스택이 비어있지 않을 때 
        	if(!subCon.empty()) {
            	//만약에 택배아저씨가 말한 값과 서브컨베이어벨트의 마지막 값이 같을 때
            	if(order[answer] == subCon.peek()) {
            		answer++;
            		subCon.pop();
            		continue;
            	}
        	}
        	
        	//만약에 컨베이어벨트에서 오는 박스 값이 택배아저씨가 말한 값과 같지않을 때 
    		subCon.push(currentBox);
    		currentBox++;
    	}
        return answer;
    }
}