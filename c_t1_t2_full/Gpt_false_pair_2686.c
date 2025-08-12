int main () {
    time_t timer;
    char buffer [26];
    struct tm *tm_info;
    time (& timer);
    tm_info = localtime (&timer);
    strftime (buffer, 26, "%Y-%m-%d %H:%M:%S", tm_info);
    puts (buffer);
    return 0;
}


int main () {
    time_t clock;
    char timebuf [26];
    struct tm *tm_info;
    clock = time (NULL);
    tm_info = localtime (&clock);
    strftime (timebuf, 26, "%Y-%m-%d %H:%M:%S", tm_info);
    printf ("%s\n", timebuf);
    return 0;
}
