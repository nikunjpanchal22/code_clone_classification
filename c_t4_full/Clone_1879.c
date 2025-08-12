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
	    struct student { 
		char firstName[16]; 
		char lastName[16]; 
		struct {int day, month, year;} birth; 
	    };

	    int numStudents = 3; 
	    struct student students[numStudents];
	    for (int i = 0; i < numStudents; i++) { 
		scanf ("%15s", students[i].firstName); 
		scanf ("%15s", students[i].lastName);
		scanf ("%d %d %d", &students[i].birth.day, &students[i].birth.month, &students[i].birth.year); 
	    } 
	    for (int i = 0; i < numStudents; i++) 
		printf ("First name: %s, Surname: %s, DOB: %02d/%02d/%04d\n", students[i].firstName, students[i].lastName, students[i].birth.day, students[i].birth.month, students[i].birth.year); 
	    return EXIT_SUCCESS; 
}


