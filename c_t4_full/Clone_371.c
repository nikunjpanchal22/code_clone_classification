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
    int numStudents = 3;
    int x;
    STUDENT *students;

    students = malloc(numStudents * sizeof(STUDENT));

    for (x = 0; x <= 2; x++) {
        students[x].firstName = (char *)malloc(sizeof(char *) * 20); 
        printf("Enter student's First Name:"); 
        scanf("%s", students[x].firstName); 
        students[x].lastName = (char *)malloc(sizeof(char *) * 20); 
        printf("Enter student's Last Name:"); 
        scanf("%s", students[x].lastName); 
        printf("Enter student's Birth Day:"); 
        scanf("%d", &students[x].day); 
        printf("Enter student's Birth Month:"); 
        scanf("%d", &students[x].month); 
        printf("Enter student's Year:"); 
        scanf("%d", &students[x].year); 
    } 
    
    for (x = 0; x <= 2; x++) 
        printf("Name: %s %s, %02d/%02d/%04d\n", students[x].firstName, students[x].lastName, students[x].day, students[x].month, students[x].year); 
    
    free(students);

    return (EXIT_SUCCESS); 
}


