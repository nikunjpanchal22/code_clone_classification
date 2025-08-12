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
    time_t now = time (0);
    struct tm lc = *localtime (&now);
    struct tm globa = *gmtime (&now);
    time_t lc_time = mktime (&lc); 
    time_t gmt_time = my_timegm (&globa);
    assert (lc_time == gmt_time);
    printf ("Time: %lu \nTime1: %lu \nTime2: %lu\n", now, lc_time, gmt_time);
    return 0; 
}
