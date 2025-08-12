int main (void) {
    time_t now = time (0);
    struct tm local = *localtime (&now);
    struct tm utc = *gmtime (&now);
    time_t t1 = mktime (&local);
    time_t t2 = my_timegm (&utc);
    assert (t1 == t2);
    printf ("t =%lu\nt1=%lu\nt2=%lu\n", now, t1, t2);
    return 0;
}


 
int main (void) {
    time_t timeStamp = time (0);
    struct tm localTime = *localtime(&timeStamp);
    struct tm universalTime = *gmtime(&timeStamp);
    time_t t1 = mktime(&localTime);
    time_t t2 = my_timegm(&universalTime);
    assert (t1 == t2);
    printf ("Time: %lu \nTime1: %lu \nTime2: %lu\n", timeStamp, t1, t2);
    return 0; 
}
