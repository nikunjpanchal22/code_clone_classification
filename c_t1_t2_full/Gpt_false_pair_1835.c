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
    time_t t = time (0);
    struct tm local_timestamp = *localtime (&t);
    struct tm utc_timestamp = *gmtime(&t);
    time_t t1 = mktime (&local_timestamp);
    time_t t2 = my_timegm(&utc_timestamp);
    assert (t1 == t2);
    printf ("Time: %lu \nTime1: %lu \nTime2: %lu\n", t, t1, t2);
    return 0; 
}
