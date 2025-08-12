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



#include <stdio.h>
struct perdata {
    char name[20];
    int age;
    float salary;
};

int main() {
    struct perdata p[4];
    int count;

    for(count = 0; count<4; count++) {
        scanf("%s",&p[count].name);
    }

    for(count = 0; count<4; count++) {
    printf("p%d.name:%s\n",count+1,p[count].name);
    }
    return 0;
}


