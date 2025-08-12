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
#include <math.h>
#include <stdint.h>
#include <time.h>

int main(int argc, char **argv){
    uint32_t t = strtoul(argv[1], NULL, 16);
    uint16_t d = t >> 16, v = t & 0xFFFF;
    uint16_t base_y = 1986 + ((v & 0x8000) >> 15) * 8;
    uint8_t third_d = d % 3;
    time_t r = ((d/3) + (v & 0x8000 ? 8765 : 5843)) * 86400 + third_d * 28800 + (v & 0x7FFF);
    int y = base_y, ye=gmtime(&r)->tm_year+1900; 
    int dd=0;
    while(y<= ye){
        if(y< ye && v & 0x8000){
            if(y%4 || (!(y%100) && y%400)) --dd;
        } else if(y != ye && y%4 == 0 && ((y%100) || y%400 ==0)){
            ++dd;
        }
        ++y;
    }
    r += (d < 3 ? 1:dd)*86400;
    printf("%s", ctime(&r));
    printf("%s", asctime(gmtime(&r)));
    return 0;
}


