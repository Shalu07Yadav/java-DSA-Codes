import java.util.*;
public class Activity_Selection {
    public static void main(String args[]){

        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9}; //sorted hai pehle se

       /* 
       //sorting
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //lambda function
        Arrays.sort(activities,Comparator.comparingDouble(o->0[2]));
    
        */
        

       //end time basic sorted
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        maxAct=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=0;i<end.length;i++){
            if(start[i]>lastend){
                maxAct++;
               ans.add(i);
               lastend=end[i];
            }
        }

        System.out.println("maximim activity="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");

        }

    }
}
