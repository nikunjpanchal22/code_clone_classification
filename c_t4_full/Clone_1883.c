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

typedef struct {
	    char first_name[50];
	    char last_name[50];
	    int date_of_birth[3];
	} STUDENT;

	STUDENT get_student_data() {
	    STUDENT student;
	    scanf("%s %s %d %d %d", student.first_name, student.last_name, &student.date_of_birth[0], &student.date_of_birth[1], &student.date_of_birth[2]);
	    return student;
	}

	int main(int argc, char **argv) { 
	    int num_students = 3;
	    STUDENT students[num_students];
	    for (int i = 0; i < num_students; ++i) {
		students[i] = get_student_data();
	    }
	    for (int i = 0; i < num_students; ++i) {
		printf("First name: %s, Surname: %s, DOB: %02d/%02d/%04d\n", students[i].first_name, students[i].last_name, students[i].date_of_birth[0], students[i].date_of_birth[1], students[i].date_of_birth[2]);
	    }
	    return EXIT_SUCCESS;
}


