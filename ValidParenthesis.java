import java.util.*;
public class ValidParenthesis {

    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['  ){
                s.push(ch);
            } else{
                if(s.isEmpty()){          //)))))) esa kuch hoga to  stack to khali hi hoga
                    return false;
                }
             //pair wala cond
             if((s.peek()=='(' && ch==')')  || (s.peek()=='{' && ch=='}')|| (s.peek()=='[' && ch==']')){
                s.pop();
             } 
             else{
                return false;
             }

            }
        }
        if(s.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        String str=")))";
        System.out.println(isValid(str));

    }
}
