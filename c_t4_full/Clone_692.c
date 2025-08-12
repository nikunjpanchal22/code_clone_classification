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
    char buf[100];
    struct tm e0;
    time_t pseudo;
    struct tm e1;
    e0.tm_year = 70;
    e0.tm_mday = 1;
    pseudo = mktime(&e0);
    e1 = *gmtime(&pseudo);
    e0.tm_sec += atoi(argv[1]) - diff_tm(&e1, &e0);
    pseudo = mktime(&e0);
    strftime(buf, sizeof(buf), "%A, %B %d, %Y at %I:%M %p", &e0);
    printf("The date and time are: %s\n", buf);
}


