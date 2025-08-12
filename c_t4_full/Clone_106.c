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
    struct tm *current, xmas;
    time_t now;

    time(&now);
    current = localtime(&now);
    xmas.tm_mon = 11;
    xmas.tm_mday = 25;
    if (xmas.tm_mon < current->tm_mon) {
        xmas.tm_year = current->tm_year + 1;
    }
    else {
        xmas.tm_year = current->tm_year;
    }

    time_t xmasTime;
    xmasTime = mktime(&xmas);

    daysLeft = difftime(xmasTime, now)/86400;

    printf("Number of days until christmas is: %g\n", daysLeft);
    return 0;
}


