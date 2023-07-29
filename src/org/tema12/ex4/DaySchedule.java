package org.tema12.ex4;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private DayOfWeek day;
    private List<String> activities;

    public DaySchedule(DayOfWeek day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public DayOfWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

}
