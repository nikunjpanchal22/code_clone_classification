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
    time_t date;
    struct tm *now, xmas;
    double days;
    
    time(&date);
    now = localtime(&date);
    
    xmas = *now;
    xmas.tm_mon = 11;
    xmas.tm_mday = 25;
    if (now->tm_mon == 11 && now->tm_mday > 25)
        xmas.tm_year++;
        
    days = difftime(mktime(&xmas), date) / 86400.0;
    printf("%g days\n", days);
    
    return 0;
}


