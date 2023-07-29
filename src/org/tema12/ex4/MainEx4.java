package org.tema12.ex4;

public class MainEx4 {
    public static void main(String[] args) {

        DaySchedule mondaySchedule = new DaySchedule(DayOfWeek.MONDAY);
        mondaySchedule.addActivity("Meeting with team");
        mondaySchedule.addActivity("Prepare presentation");
        mondaySchedule.addActivity("Lunch with colleagues");


        DaySchedule tuesdaySchedule = new DaySchedule(DayOfWeek.TUESDAY);
        tuesdaySchedule.addActivity("Client meeting");
        tuesdaySchedule.addActivity("Work on project deliverables");
        tuesdaySchedule.addActivity("Gym session");


        System.out.println("Monday's Schedule:");
        printActivities(mondaySchedule);


        System.out.println("\nTuesday's Schedule:");
        printActivities(tuesdaySchedule);
    }


    private static void printActivities(DaySchedule daySchedule) {
        System.out.println(daySchedule.getDay() + ":");
        for (String activity : daySchedule.getActivities()) {
            System.out.println("- " + activity);
        }
    }
}
