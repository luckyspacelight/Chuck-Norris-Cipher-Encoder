
class Clock {

    final int lastMinute = 59;
    final int lastHour = 12;
    
    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes == lastMinute) {
            minutes = 0;
            if (hours == lastHour) {
                hours = 1;
            } else {
                hours += 1;
            }
        } else {
            minutes += 1;
        }
    }
}
