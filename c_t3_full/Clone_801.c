int main (int argc, char **argv) {
    typedef struct {
        char *firstName;
        char *lastName;
        int day;
        int month;
        int year;
    } STUDENT;
    int numStudents = 3;
    int x;
    STUDENT *students = malloc (numStudents * sizeof *students);
    for (x = 0; x < numStudents; x++) {
        students[x].firstName = (char *) malloc (sizeof (char *));
        scanf ("%s", students [x].firstName);
        students[x].lastName = (char *) malloc (sizeof (char *));
        scanf ("%s", students [x].lastName);
        scanf ("%d", & students [x].day);
        scanf ("%d", & students [x].month);
        scanf ("%d", & students [x].year);
    }
    for (x = 0; x < numStudents; x++)
        printf ("first name: %s, surname: %s, day: %d, month: %d, year: %d\n", students[x].firstName, students[x].lastName, students[x].day, students[x].month, students[x].year);
    return (EXIT_SUCCESS);
}


 int main (int argc, char **argv) {
    typedef struct {
        char *firstName;
        char *lastName;
        int day;
        int month;
        int year;
    } STUDENT;

    int numStudents;
    int x;
    STUDENT *students;

    printf("Input the number of students: ");
    scanf("%d", &numStudents);
    students = malloc(numStudents * sizeof(STUDENT));

    for (x = 0; x < numStudents; x++) {
        students[x].firstName = (char *)malloc(sizeof(char *)*20);
        printf("Enter the first name for student %d: ", x+1);
        scanf("%s", students[x].firstName);

        students[x].lastName = (char *)malloc(sizeof(char *) * 20);
        printf("Enter the last name for student %d: ", x+1);
        scanf("%s", students[x].lastName);

        printf("Enter the birth day for student %d: ", x+1);
        scanf("%d", &students[x].day);

        printf("Enter the birth month for student %d: ", x+1);
        scanf("%d", &students[x].month);

        printf("Enter the birth year for student %d: ", x+1);
        scanf("%d", &students[x].year);
    }

    for (x = 0; x < numStudents; x++)
        printf("Name: %s %s, %02d/%02d/%04d\n", students[x].firstName, students[x].lastName, students[x].day, students[x].month, students[x].year);

    return EXIT_SUCCESS;
}


