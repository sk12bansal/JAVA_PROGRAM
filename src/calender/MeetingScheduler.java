package calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MeetingScheduler {
    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static public class Meeting {
        String employee;
        Date startTime;
        Date endTime;
        int duration;

        List<Meeting> meetings = new ArrayList<>();

        static final int MINUTE = 60000;

        Meeting() {

        }

        Meeting(Employee employee, Date startTime, int duration) {
            this.employee = employee.name;
            this.startTime = startTime;
            this.endTime = new Date(startTime.getTime() + (MINUTE * duration));
            this.duration = duration;
        }

        public List<Meeting> getMeetings() {
            return meetings;
        }

        void addMeetings(Meeting meeting) {
            this.meetings.add(meeting);
        }

        void removeMeetings(String employee) {
            for (int i = 0; i < meetings.size(); i++) {
                if (meetings.get(i).employee.equalsIgnoreCase(employee)) {
                    meetings.remove(meetings.get(i));
                }
            }
        }

    }


    static private void printAllMeetingOfEmployee(String str, List<Meeting> meetings) {
        for (int i = 0; i < meetings.size(); i++) {
            if (str.equalsIgnoreCase(meetings.get(i).employee)) {
                System.out.println("Meetings booked for " + str + " " + meetings.get(i).startTime + meetings.get(i).duration);
            }
        }
    }

    static private int roomRequiredForAllMeetings(List<Meeting> meetings) {
        List<Integer> startTimeList = new ArrayList<>();
        List<Integer> endTimeList = new ArrayList<>();
        int room = 1;
        int maxRoom = 1;
        for (int i = 0; i < meetings.size(); i++) {
            int startTime = meetings.get(i).startTime.getHours() + meetings.get(i).startTime.getMinutes();
            int endTime = meetings.get(i).endTime.getHours() + meetings.get(i).endTime.getMinutes();
            startTimeList.add(startTime);
            endTimeList.add(endTime);
        }
        Collections.sort(startTimeList);
        Collections.sort(endTimeList);

        int i = 1;
        int j = 0;
        int n = startTimeList.size();
        while (i < n && j < n) {

            if (startTimeList.get(i) <= endTimeList.get(j)) {
                room++;
                i++;
                if (room > maxRoom) {
                    maxRoom = room;
                }
            } else {
                room--;
                j++;
            }
        }
        return maxRoom;
    }

    public static void main(String[] args) {

        //option 1 and 2
        /*
         * Add an employee and creating meeting invites with list of invite
         * */
        Meeting[] meetingsToBook = new Meeting[]{

                new Meeting(new Employee("Suraj"), convertDateFormat("21-Nov-2019:09:00"), 15),
                new Meeting(new Employee("kiran"), convertDateFormat("21-Nov-2019:09:10"), 15),
                new Meeting(new Employee("kiran"), convertDateFormat("21-Nov-2019:09:20"), 25),
                new Meeting(new Employee("Akhand"), convertDateFormat("21-Nov-2019:09:30"), 20),
                new Meeting(new Employee("Deepak"), convertDateFormat("21-Nov-2019:09:40"), 15),
                new Meeting(new Employee("Suraj"), convertDateFormat("21-Nov-2019:11:40"), 30),
        };

        Meeting meeting = new Meeting();

        for (int i = 0; i < meetingsToBook.length; i++) {
            meeting.addMeetings(meetingsToBook[i]);
        }

        /* List of Meetings Invites */
        List<Meeting> meetings = new ArrayList<>();
        meetings.addAll(Arrays.asList(meetingsToBook));


        // option 3
        // List all the meeting for any given employee
        System.out.println("List all the meeting for any given employee\n");
        printAllMeetingOfEmployee("suraj", meetings);
        printAllMeetingOfEmployee("kiran", meetings);


        // Extension  1
        // List  minimum number of meetings room required for all meetings
        int rooms = roomRequiredForAllMeetings(meetings);
        System.out.println("\nminimum number of meetings room required for all meetings: " + rooms);

        // Extension 2
        // Add a meeting room
        meeting.addMeetings(new Meeting(new Employee("Aman"), convertDateFormat("21-Nov-2019:12:00"), 60));
    }


    private static Date convertDateFormat(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy:HH:mm");
        Date date2 = null;
        try {
            //Parsing the String
            date2 = dateFormat.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date2;
    }
}
