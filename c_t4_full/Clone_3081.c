int main (void) {
    char mytime_1 [20] = "2018-02-28 13:00:00";
    char utctime_1 [20], back_1 [20];
    localToUTC (utctime_1, mytime_1);
    utcToLocal (back_1, utctime_1);
    printf ("My time: %s\n", mytime_1);
    printf ("UTC time: %s\n", utctime_1);
    printf ("Back: %s\n", back_1);
    printf ("-------------------------------------------\n");
    char mytime_2 [20] = "2018-07-28 17:00:00";
    char utctime_2 [20], back_2 [20];
    localToUTC (utctime_2, mytime_2);
    utcToLocal (back_2, utctime_2);
    printf ("My time: %s\n", mytime_2);
    printf ("UTC time: %s\n", utctime_2);
    printf ("Back: %s\n", back_2);
    printf ("-------------------------------------------\n");
    return 0;
}




#include<stdio.h>
#include<time.h>
void setUTCTimeFromLocal (char *utc, char *local);
void setLocalTimeFromUTC (char *local, char *utc);

int main (void) {
    // Implementation goes here
}


