package program;

import java.util.*;

class Meeting{
    int startTime;
    int endTime;
    int index;

    public Meeting(int startTime, int endTime, int index) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.index = index;
    }
}
public class NMeetingsInOneRoom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] start = new int[n];
            int[] end = new int[n];
            for(int i=0;i<n;i++){
                start[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                end[i] = sc.nextInt();
            }
            List<Meeting> meetingList = new ArrayList<>();
            for(int i=0;i<n;i++){
                meetingList.add(new Meeting(start[i],end[i],i+1));
            }
            Collections.sort(meetingList, new Comparator<Meeting>() {
                @Override
                public int compare(Meeting o1, Meeting o2) {
                    return o1.endTime - o2.endTime;
                }
            });

            System.out.print(meetingList.get(0).index + " ");
            int timit_limit = meetingList.get(0).endTime;
            for (int i = 1; i < meetingList.size(); i++) {
                int nexStartTime = meetingList.get(i).startTime;
                if(nexStartTime >= timit_limit){
                    System.out.print(meetingList.get(i).index + " ");
                    timit_limit = meetingList.get(i).endTime;
                }
            }
             t-=1;
        }
    }
}
