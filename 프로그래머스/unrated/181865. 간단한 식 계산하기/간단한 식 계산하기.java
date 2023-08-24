class Solution {
    public int solution(String binomial) {
        String[] result = binomial.split(" ");
        int a = Integer.parseInt(result[0]);
        String op = result[1];
        int b = Integer.parseInt(result[2]);

        int answer = 0;

        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        } else if (op.equals("/")) {
            answer = a / b;
        }

        return answer;
    }
}
