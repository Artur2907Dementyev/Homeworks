package lesson44.Hw44;

import java.time.LocalDateTime;

public class Meeting {

    String person1;
    String person2;
    LocalDateTime meetingDateTime;

    public Meeting(String person1, String person2, LocalDateTime meetingDateTime) {
        this.person1 = person1;
        this.person2 = person2;
        this.meetingDateTime = meetingDateTime;
    }

    @Override
    public String toString() {
        return "Meeting between " + person1 + " and " + person2 + " on " + meetingDateTime;
    }
}

