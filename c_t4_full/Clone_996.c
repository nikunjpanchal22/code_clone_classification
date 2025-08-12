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
#include <string.h>
struct perdata {
    char name[20];
    int age;
    float salary;
};
int main() {
    struct perdata p[4] = {"John", 30, 50000, "Alice", 32, 65000, "Bob", 38, 40000, "Emma", 29, 55000}; 
    for (int i = 0; i < 4; i++) 
        printf("p%d.name:%s\n", i + 1, p[i].name);
}


