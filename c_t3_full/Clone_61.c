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


 int main (int argc, char ** argv) {
    struct perdata {
        char name [20];
        int age;
        float salary;
    };
    struct perdata p [4];
    for (int i = 0; i < 4; i++) {
        printf("Enter the name of person %d :", i+1);
        scanf("%19s", p[i].name);
        while (getchar() != '\n');
    }
    for (int i = 0; i < 4; i++) {
        printf("p%d.name:%s\n", i+1, p[i].name);
    }
    getchar();
    return 0;
}


