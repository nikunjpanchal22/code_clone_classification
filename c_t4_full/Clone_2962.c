int main (void) {
    int month, day, year, day_number = 0;
    printf ("Enter a date in the form (01/02/1996): ");
    scanf ("%d/%d/%d", & month, & day, & year);
    switch (month) {
    case 1 :
        day_number = day;
        break;
    case 2 :
        day_number = 31 + day;
        break;
    case 3 :
        day_number = 59 + day;
        break;
    case 4 :
        day_number = 90 + day;
        break;
    case 5 :
        day_number = 120 + day;
        break;
    case 6 :
        day_number = 151 + day;
        break;
    case 7 :
        day_number = 181 + day;
        break;
    case 8 :
        day_number = 212 + day;
        break;
    case 9 :
        day_number = 243 + day;
        break;
    case 10 :
        day_number = 273 + day;
        break;
    case 11 :
        day_number = 304 + day;
        break;
    case 12 :
        day_number = 334 + day;
        break;
    }
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        if (month > 2)
            ++day_number;
    }
    printf ("day %d\n", day_number);
    return 0;
}





#include<stdio.h>
void year(long *year, long *date){
        *year=(*date%10000);
        *date/=10000;
    }
    void month(long *month, long *date){
        *month=(*date%100);
        *date/=100;
    }
    void day(long *day, long *date){
        *day=*date;
    }
    int main(){
        long m1[11]={31,59,90,120,151,181,212,243,273,304,334},a,y,n,mm,dd;
        scanf("%ld", &n);
        year(&y, &n);
        month(&mm,&n);
        day(&dd,&n);
        a=dd+m1[mm-2];
        if(((y%4==0)&&(y%100!=0))||(y%400==0)){
            if(mm>2)
                ++a;
        }
        printf("%ld\n", a);
        return 0;
}


