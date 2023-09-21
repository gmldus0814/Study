import java.util.*;
 
class Solution {
    public int solution(int[] a) {
        int answer = 0;
        if (a.length == 1) return 1; //풍선이 한개일때
        if (a.length == 2) return 2; //풍선이 두개일때
        
        int leftMin = a[0];
        int rightMin[] = new int[a.length];
        rightMin[a.length-1] = a[a.length-1];
        
        for(int i = a.length -2; i > 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], a[i]);
        }
        
        for(int i = 0; i < a.length; i++) {
            if (!(leftMin < a[i] && rightMin[i] < a[i]))
                answer++;
            leftMin = Math.min(leftMin, a[i]);
        }
        return answer;
    }
}
