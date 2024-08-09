import java.util.ArrayList;
public class ArrayListSol {
     public static void main(String args[]){
        //classname obejctname=new classname(); class ka naam capital se shuru hota hai java me .
        ArrayList<Integer> list=new ArrayList<>(); //<> iska kaam hai hm kis type ka datatype use kr rhe hai
         //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
          
        //kisi bhi index pr jakr val store krna
        // list.add(1,90);
        // System.out.println(list);



        //get(index value pass hota hai);
        // int element=list.get(2);
        // System.out.println(element);

        // //delete
        // list.remove(2);
        // System.out.println(list);

        // //set
        // list.set(2,10);
        // System.out.println(list);

        //contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(10));

        //print the arrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }


     }
}
