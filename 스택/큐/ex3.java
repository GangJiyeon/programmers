import java.util.ArrayList;
import java.util.List;

public class ex3 {
    
    public static void main(String[] args) {
        
        String str = "(())))()()";
     
        
        boolean answer = true;

        //전체 길이가 홀수이면 false
        if(str.length()%2==1){
            answer=false;
        //아니라면    
        }else{
            //시작과 끝이 닫힌 괄호가 아니면 false
            if(str.charAt(0)==')'||str.charAt(str.length()-1)=='('){
                answer = false;
            }else{
                //괄호가 닫히는 부분 사이( ')(' ) 를 잘라 새로운 문자열 만들기
                int[] arr = new int[str.length()];   
                List<Integer> split_index = new ArrayList<>();

                for (int i = 0; i < str.length()-1; i++) {     
                    if(str.charAt(i)==')' && str.charAt(i+1)=='('){
                        split_index.add(i);
                    }
                }

                for(int i = 0; i<split_index.size()-1; i++){
                    //잘린 문자열의 갯수가 홀수이거나 중앙이 () 아니면 false
                    if((split_index.get(i+1)-split_index.get(i))%2==1){
                        answer = false;
                        break;
                    }
 
                    if(!(str.charAt(split_index.get(i)+split_index.get(i+1))==
                    '('&& str.charAt(split_index.get(i))==')') ){
                        answer = false;
                        break;
                    }

                }

            } 
        }
        

        
        
        System.out.println(answer);


    
    }
}
