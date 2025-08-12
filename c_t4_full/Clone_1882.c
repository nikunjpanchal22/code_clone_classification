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





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
	    char firstName[50];
	    char lastName[50];
	    int day, month, year;
	} STUDENT;

	void getStudents(STUDENT students[], int n) {
	    for(int i = 0; i < n; i++) {
		printf("Enter student's details:\n");
		scanf("%s %s %d %d %d", students[i].firstName, students[i].lastName, &students[i].day, &students[i].month, &students[i].year);
	    }
	}

	void printStudents(STUDENT students[], int n) {
	    for(int i = 0; i < n; i++) {
		printf("First Name: %s, Last Name: %s, Date of Birth: %d / %d / %d\n", students[i].firstName, students[i].lastName, students[i].day, students[i].month, students[i].year);
	    }
	}

	int main() {
	    int numStudents = 3;
	    STUDENT students[numStudents];
	    getStudents(students, numStudents);
	    printStudents(students, numStudents);
	    return EXIT_SUCCESS;
}


