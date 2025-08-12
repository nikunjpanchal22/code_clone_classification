int main (int argc, char **argv) {
    char buf [100];
    struct tm e0 = {
        .tm_year = 70,
        .tm_mday = 1
    }, e1, new;
    time_t pseudo = mktime (&e0);
    e1 = *gmtime (&pseudo);
    e0.tm_sec += atoi (argv[1]) - diff_tm (&e1, &e0);
    mktime (& e0);
    strftime (buf, sizeof buf, "%c", & e0);
    puts (buf);
}


int main (int argc, char **argv) {
    char buf [100];
    struct tm e0 = {
        .tm_year = 70,
        .tm_wday = 4,
        .tm_mday = 1
    }, e1, new;
    time_t pseudo = mktime (&e0);
    e1 = *gmtime (&pseudo);
    e0.tm_sec += atoi (argv[1]) - diff_tm (&e1, &e0);
    mktime (& e0);
    strftime (buf, sizeof buf, "%A %d %B %Y %H:%M:%S", & e0);
    puts (buf);
}
