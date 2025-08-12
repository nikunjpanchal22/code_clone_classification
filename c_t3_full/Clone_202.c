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


 int main () {
    double days;
    struct tm xmas, today;
    time_t currentDate;
    time (& currentDate);
    today = *localtime (&currentDate);
    xmas.tm_mon = 11;
    xmas.tm_mday = 25;
    if (today.tm_mday > 25 && today.tm_mon == 11)
        xmas.tm_year = today.tm_year + 1;
    double seconds = difftime (mktime (&xmas), currentDate);
    days = seconds / 86400;
    printf ("Days until Christmas are: %g\n", days);
    return 0;
}


