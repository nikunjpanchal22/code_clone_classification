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


  int main (void)
{
  time_t T;
  struct tm *local, *gmt;

  T = time (NULL);
  local = localtime (&T);
  printf ("Local time and date: %s\n", asctime (local));
  gmt = gmtime (&T);
  printf ("UTC time and date: %s\n", asctime (gmt));

  return 0;
}
