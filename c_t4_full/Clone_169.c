int main (void) {
    struct tm *local;
    time_t t;
    t = time (NULL);
    local = localtime (&t);
    printf ("Local time and date: %s\n", asctime (local));
    local = gmtime (&t);
    printf ("UTC time and date: %s\n", asctime (local));
    return 0;
}


 int main ()
{
    char localTime[26], utcTime[26];
    time_t rawtime;
    struct tm *info;

    time ( &rawtime );
    // Format it from UTC to local
    info = localtime ( &rawtime );
    strftime(localTime, 26, "%Y-%m-%d %H:%M:%S", info);
    printf ("Local time and date: %s\n", localTime);

    // Change the format to UTC
    info = gmtime ( &rawtime );
    strftime(utcTime, 26, "%Y-%m-%d %H:%M:%S", info);
    printf ("UTC time and date: %s\n", utcTime);

    return 0;

}


