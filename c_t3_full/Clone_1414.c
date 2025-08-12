int main () {
    char buffer [26];
    int millisec;
    struct tm *tm_info;
    struct timeval tv;
    gettimeofday (& tv, NULL);
    millisec = lrint (tv.tv_usec / 1000.0);
    if (millisec >= 1000) {
        millisec -= 1000;
        tv.tv_sec++;
    }
    tm_info = localtime (&tv.tv_sec);
    strftime (buffer, 26, "%Y:%m:%d %H:%M:%S", tm_info);
    printf ("%s.%03d\n", buffer, millisec);
    return 0;
}


 int main () {
    char timeStr [26];
    int millisec;
    time_t currTime;
    struct tm result;
    struct timeval tv;
    gettimeofday (&tv, NULL);
    currTime = tv.tv_sec;
    localtime_r(&currTime, &result);
    strftime(timeStr, sizeof(timeStr), "%Y:%m:%d %H:%M:%S", &result);
    millisec = lrint(tv.tv_usec / 1000.0);
    if (millisec < 1000) {
      printf("%s.%03d\n", timeStr, millisec);
    }
    else {
      printf("%s.(%d-1000).%03d\n",timeStr, millisec, milli second - 1000);
    }
    return 0;
   }

 int main(){
    char buffer[26];
    int millisec;
    struct tm *tm_info;
    struct timeval tv;
    gettimeofday(&tv,NULL);
    millisec = lrint(tv.tv_usec/1000.0);
    if(millisec >= 1000){
        millisec -=1000;
        tv.tv_sec++;
    }
    tm_info = localtime(&tv.tv_sec);
    strftime (buffer, 26, "%Y-%m-%d %H:%M:%S", tm_info);
    printf("%s.%03d\n", buffer, millisec);
    return 0;
}


