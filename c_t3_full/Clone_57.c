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


 int main (void) {
    struct perdata {
        char name [20];
        int age;
        float salary;
    };
    struct perdata p [4];
    char tempname[20];
    for (int i = 0; i < 4; i++) {
        printf("Please enter the name of person %d: ", i+1);
        fgets(tempname, 20, stdin);
        strncpy(p[i].name, tempname, 20);
    }
    for (int i = 0; i < 4; i++) {
        printf("p%d.name:%s\n", i + 1, p[i].name);
    }
    getchar();
    return 0;
}


