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
    time_t now;
    struct tm *loc, tmp;
    double days;
    
    time(&now);
    loc = localtime(&now);
    
    tmp = *loc;
    tmp.tm_mon = 11;
    tmp.tm_mday = 25;
    if (loc->tm_mon == 11 && loc->tm_mday > 25)
        tmp.tm_year++;
        
    days = difftime(mktime(&tmp), now) / 86400.0;
    printf("%g days\n", days);
    
    return 0;
}


