int main (void) {
    struct perdata {
        char name [20];
        int age;
        float salary;
    };
    struct perdata p [4];
    for (int i = 0; i < 4; i++) {
        scanf ("%s", & p [i].name);
    }
    for (int i = 0; i < 4; i++) {
        printf ("p%d.name:%s\n", i + 1, p [i].name);
    }
    getch ();
}



#include<stdio.h>
int main() {
    struct  perdata {
        char name[10];
        int age;
        float salary;
    };
    struct perdata per[4];
    int i;
    for(i = 0; i < 4; i++)
        scanf("%s",&per[i].name);
    for(i = 0; i < 4; i++)
        printf("p%d.name:%s\n",i+1,per[i].name);
    return 0;
}


