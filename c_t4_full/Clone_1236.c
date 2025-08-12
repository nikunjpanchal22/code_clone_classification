int main () {
    double seconds, days;
    time_t currentDate;
    struct tm *xmas, today;
    time (& currentDate);
    today = *localtime (&currentDate);
    xmas = localtime (&currentDate);
    xmas->tm_mon = 11;
    xmas->tm_mday = 25;
    if (today.tm_mday > 25 && today.tm_mon == 11)
        xmas->tm_year = today.tm_year + 1;
    seconds = difftime (mktime (xmas), currentDate);
    days = seconds / 86400;
    printf ("%g days\n", days);
    return 0;
}





#include <stdio.h>
#include <time.h>

int main () {
    time_t curr_time;
    struct tm *today, christmas;
    double days;
    
    time(&curr_time);
    today = localtime(&curr_time);
    
    christmas = *today;
    christmas.tm_mon = 11;
    christmas.tm_mday = 25;
    if (today->tm_mon == 11 && today->tm_mday > 25)
        christmas.tm_year++;
        
    days = difftime(mktime(&christmas), curr_time) / 86400.0;
    printf("%g days\n", days);
    
    return 0;
}


