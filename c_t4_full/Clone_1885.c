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

	void get_all_students(STUDENT *all_students, int student_count) {
	    for (int i = 0; i < student_count; i++) {
		scanf ("%s %s %d %d %d", all_students[i].first_name, all_students[i].last_name, &all_students[i].date_of_birth[0], &all_students[i].date_of_birth[1], &all_students[i].date_of_birth[2]);
	    }
	}

	void print_all_students(STUDENT *all_students, int student_count) {
	    for (int i = 0; i < student_count; i++) {
		printf("First name: %s, Surname: %s, DOB: %02d/%02d/%04d\n", all_students[i].first_name, all_students[i].last_name, all_students[i].date_of_birth[0], all_students[i].date_of_birth[1], all_students[i].date_of_birth[2]);
	    }
	}

	int main(int argc, char **argv) {
	    int num_students = 3; 
	    STUDENT students[num_students];
	    get_all_students(students, num_students);
	    print_all_students(students, num_students);
	    return EXIT_SUCCESS;
}


