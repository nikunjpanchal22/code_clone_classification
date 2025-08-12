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
    time_t t;
    struct tm *curr_time, xmas_time;
    double days;
    
    time(&t);
    curr_time = localtime(&t);
    
    xmas_time = *curr_time;
    xmas_time.tm_mon = 11;
    xmas_time.tm_mday = 25;
    if (curr_time->tm_mon == 11 && curr_time->tm_mday > 25)
        xmas_time.tm_year++;
        
    days = difftime(mktime(&xmas_time), t) / 86400.0;
    printf("%g days\n", days);
    
    return 0;
}


