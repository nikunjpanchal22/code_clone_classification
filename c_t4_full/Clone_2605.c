int main (int argc, char *argv []) {
    uint32_t datetime = strtoul (argv[1], NULL, 16);
    uint16_t mydate = datetime >> 16;
    uint16_t mytime = datetime & 0xFFFF;
    int new_encoding = (mytime & 0x8000) != 0;
    time_t linuxSeconds = (mydate / 3);
    uint8_t third_Count = mydate % 3;
    if (new_encoding) {
        linuxSeconds += 8765;
    }
    else {
        linuxSeconds += 5843;
    }
    linuxSeconds *= 24;
    linuxSeconds *= 3600;
    linuxSeconds += (mytime & 0x7FFF);
    linuxSeconds += (third_Count * 28800);
    struct tm *mytm = gmtime (&linuxSeconds);
    int daydiff = 0, year;
    for (year = new_encoding ? 1994 : 1986; year <= mytm->tm_year + 1900; year++) {
        if (year < mytm->tm_year + 1900) {
            if (new_encoding) {
                if (!isleap (year)) {
                    daydiff--;
                }
            }
            else {
                if (year != (mytm->tm_year + 1900) && isleap (year)) {
                    daydiff++;
                }
            }
        }
    }
    if (mydate < 0x0003) {
        linuxSeconds += 86400;
    }
    else {
        linuxSeconds += daydiff * 86400;
    }
    printf (ctime (& linuxSeconds));
    printf (asctime (gmtime (& linuxSeconds)));
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdint.h>
int main(int argc, char *argv[]){
    uint32_t datetime = strtoul(argv[1], NULL, 16);
    uint16_t date = datetime>>16, time = datetime&65535;
    uint32_t third = date%3, unix_time = ((date/3 + ((time>>15)?8765:5843))*86400) + (time&32767) + (third*28800);
    int leap, year = (time>>15)?1994:1986; for(; year <= (gmtime(&unix_time)->tm_year + 1900); year++){
        if(((year%4 == 0)&&(year%100 != 0))||(year%400 == 0)) leap++; 
    }unix_time += ((date<3)?1:leap)*(day);
    printf("%s %s", ctime(&unix_time), asctime(gmtime(&unix_time)));
    return 0;
}


