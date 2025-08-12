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


 int main() {
    double daysLeft;
    struct tm *theDate, xmas;
    time_t start;

    time(&start);
    theDate = localtime(&start);
    xmas.tm_mon = 11;
    xmas.tm_mday = 25;
    if (xmas.tm_mon < theDate->tm_mon) {
        xmas.tm_year = theDate->tm_year + 1;
    }
    else {
        xmas.tm_year = theDate->tm_year;
    }

    time_t xmasDate;
    xmasDate = mktime(&xmas);

    daysLeft = difftime(xmasDate, start)/86400;

    printf("Number of days until christmas is: %g\n", daysLeft);
    return 0;
}


