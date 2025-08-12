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


 int main(int argc, char **argv) {
    int numStudents = 3;
    int x;
    STUDENT *students;
    char firstName[20];
    char lastName[20];

    students = malloc(numStudents * sizeof(STUDENT));

    for (x = 0; x < numStudents; x++) {
        printf("Enter student %d First Name: ", x+1);
        scanf("%s", firstName);
        students[x].firstName = (char *)malloc(sizeof(char *)*(strlen(firstName) + 1));
        strcpy(students[x].firstName, firstName);

        printf("Enter student %d Last Name: ", x+1);
        scanf("%s", lastName);
        students[x].lastName = (char *)malloc(sizeof(char *)*(strlen(lastName) + 1));
        strcpy(students[x].lastName, lastName);

        printf("Enter student %d Birth Day: ", x+1);
        scanf("%d", &students[x].day);

        printf("Enter student %d Birth Month: ", x+1);
        scanf("%d", &students[x].month);

        printf("Enter student %d Year: ", x+1);
        scanf("%d", &students[x].year);
    }

    for (x = 0; x < numStudents; x++)
        printf("Name: %s %s, %02d/%02d/%04d\n",
            students[x].firstName, students[x].lastName,
            students[x].day, students[x].month, students[x].year);

    free(students);

    return EXIT_SUCCESS;
}


