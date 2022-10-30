import java.util.Stack;

public class AlgoClass {

    public AlgoClass(){

    }

    public boolean isMathCorrect(String s){
        if(!s.contains("(") && !s.contains("[") && !s.contains(")") && !s.contains("]")){
            return true;
        }
        Stack<Character> bpStack = new Stack<Character>();

        for(int i = 0; i <s.length(); i++){
            char currentChar = s.charAt(i);

            if(currentChar == '(' || currentChar == '['){
                bpStack.push(currentChar);
            }else if(currentChar == ')' || currentChar == ']'){
                if(bpStack.isEmpty()){
                    return false;
                }
                switch (bpStack.peek()){
                    case '(':
                        if(currentChar == ']'){
                            return false;
                        }else if(currentChar == ')'){
                            bpStack.pop();
                        }
                        break;
                    case '[':
                        if(currentChar == ')'){
                            return false;
                        }else if(currentChar == ']'){
                            bpStack.pop();
                        }
                        break;
                    default:
                }
            }
        }

        return  bpStack.isEmpty();
    }
}
