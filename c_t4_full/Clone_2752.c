int main (void) {
    int64_t number = 2001000200030LL;
    char data [24];
    char digit [5] = {0}, *p;
    int len, r;
    len = sprintf (data, "%lld", number);
    p = data;
    r = len % 4;
    if (r) {
        strncpy (digit, p, r);
        printf ("%s\n", digit);
        len -= r;
        p += r;
    }
    while (len != 0) {
        strncpy (digit, p, 4);
        printf ("%s\n", digit);
        len -= 4;
        p += 4;
    }
    return 0;
}




#include<stdio.h>
#include<string.h>

void printChunks(int64_t number,char* array);
void printChunks(int64_t number, char* array){
            char num[5]="";
            
            int length = sprintf(array, "%lld", number);
            int r, i;
            char *ptr;
            
            ptr = array;
            r = length % 4;
            if (r) {
                strncpy (num, ptr, r);
                printf ("%s\n", num);
                length -= r;
                ptr += r;
            }
            while(length != 0) {
                strncpy (num, ptr, 4);
                printf ("%s\n", num);
                length -= 4;
                ptr += 4;
            }
        }

        int main(){
            char data[24]="";
            printChunks(2001230430LL,data);
            return 0;
}


