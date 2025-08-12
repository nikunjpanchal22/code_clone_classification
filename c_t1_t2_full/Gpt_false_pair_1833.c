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
    time_t tmp = time (0);
    struct tm local_time = *localtime (&tmp);
    struct tm utc_time = *gmtime (&tmp);
    time_t time1 = mktime (&local_time);
    time_t time2 = my_timegm (&utc_time);
    assert (time1 == time2);
    printf ("Time: %lu \nTime1: %lu \nTime2: %lu\n", tmp, time1, time2);
    return 0; 
}
