package 프로그래머스.완전탐색;

public class 타겟넘버 {

    static class Node{
        int value;
        Node leftNode;
        Node rightNode;

        public int getValue() {
            return value;
        }

        public Node(int value){
            this.value = value;
            this.leftNode = null;
            this.rightNode = null;
        }

        public boolean isTerminal(){
            return this.leftNode == null && this.rightNode == null ? true : false;
        }

        public void setNode(Node node, int value){
            if (!node.isTerminal()){
                node.setNode(node.leftNode, value);
                node.setNode(node.rightNode, value);
            }else{
                node.leftNode = new Node(node.getValue() - value);
                node.rightNode = new Node(node.getValue() + value);
            }
        }

        public int countValue(Node node, int target){

            if (!node.isTerminal()){
                return countValue(node.leftNode, target) + countValue(node.rightNode, target);
            }else{
                if (node.getValue() == target) return 1;
            }
            return 0;
        }

    }



    public static int solution(int[] numbers, int target){
        int answer = 0;
        Node node = new Node(0);

        for (int i = 0; i < numbers.length; i++) {
            node.setNode(node, numbers[i]);
        }

        answer = node.countValue(node, target);

        return answer;
    }


    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        System.out.println(solution(numbers, target));

    }

}
