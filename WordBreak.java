import java.util.*;
public class WordBreak {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    
    //starting root khali hoti h hmesa
    static Node root=new Node();

    public static void insert(String ekhiWordJaSaktaH){
        //O(L) -  length jiska size zada j ,eg there ka h yha
         Node curr=root;
        for(int i=0;i<ekhiWordJaSaktaH.length();i++){
            int idx=ekhiWordJaSaktaH.charAt(i)-'a';

            if(curr.children[idx]==null){
                //add new node
                curr.children[idx]=new Node();
            }

            if(i==ekhiWordJaSaktaH.length()-1){
                curr.children[idx].eow=true;
            }

            curr=curr.children[idx];
        }
    }

    public static boolean search(String key){  //o(L)
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';

            if(curr.children[idx]==null){
                return false; //mtlb ye root ke children me exist nhi krta
            }

            if(i==key.length()-1 && curr.children[idx].eow==false){
                return false;
            }

            curr=curr.children[idx];
        }
        return true;
    }
    
    public static boolean WordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstPart=key.substring(0, i);
            String secondPart=key.substring(i);
            if(search(firstPart) && WordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

public static boolean startsWith(String key){
    Node curr=root;
    for(int i=0;i<key.length();i++){
        int idx=key.charAt(i)-'a';

        if(curr.children[idx]==null){
            return false;
        }
        curr=curr.children[idx];
    }
    return true;
}

public static int countNodes(Node root){
    if(root==null){
        return 0;
    }
    int cnt=0;
    for(int i=0;i<26;i++){
        if(root.children[i]!=null){
            cnt+=countNodes(root.children[i]);
        }
    }
    return cnt+1;
}
    public static void main(String[] args) {
        //word break------------------------------------------------------------------------------------------------->
        // String words[]={"i","like","sam","samsung","mobile","ice"};
        // String key="ilikesamsung";

        // for(int i=0;i<words.length;i++){
        //     insert(words[i]);
        // }
        // System.out.println(WordBreak(key));

        //startsWith problem-------------------------------------------------------------------------------------------------->
        // String words[]={"apple","app","mango","man","woman"};
        // String key="wo";
        // for(int i=0;i<words.length;i++){
        //     insert(words[i]);
        // }
        // System.out.println(startsWith(key));

        //Count Unique String--------------------------------------------------------------------------------------->
        String str="ababa";
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }

        System.out.println(countNodes(root));
    }
}
