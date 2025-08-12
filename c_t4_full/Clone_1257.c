int main (void) {
    float weight [USERS];
    float height [USERS];
    float BMI = 0.0f;
    char *BMI_Status [THRESHOLDS + 1] = {"Normal", "Overweight", "Obese"};
    float thresholds [THRESHOLDS] = {10.0, 20.0};
    int i, j;
    for (i = 0; i < USERS; i++) {
        printf ("Please enter your weight: ");
        scanf ("%f", & (weight [i]));
        printf ("Now enter your height: ");
        scanf ("%f", & (height [i]));
    }
    for (i = 0; i < USERS; i++) {
        BMI = weight[i] / (height[i] * height[i]);
        printf ("%d\t%f\t", i, BMI);
        for (j = 0; j < THRESHOLDS; j++) {
            if (BMI < thresholds[j]) {
                break;
            }
        }
        printf ("%s\n", BMI_Status [j]);
    }
    return 0;
}





#include <stdio.h>
#include <string.h>

#define USERS 3
#define THRESHOLDS 2

int main()
{
		    float weight[USERS];
		    float height[USERS];
		    float bmi;
		    char *status[THRESHOLDS + 1];
		    float thresholds[THRESHOLDS] = {18.5, 24.9};
		    int i;

		    for(i = 0; i < USERS; i++)
		    {
			printf("Enter your weight: ");
			scanf("%f", &weight[i]);
			printf("Enter your height: ");
			scanf("%f", &height[i]);
		    }
		  
		    for(i = 0; i < USERS; i++)
		    {
			bmi = weight[i] / (height[i] * height[i]);
			printf("User %d: BMI = %.2f ", i + 1, bmi);

			if(bmi < thresholds[0])
			    strcpy(status, "Underweight");
			else if(bmi < thresholds[1])
			    strcpy(status, "Normal");
			else
			    strcpy(status, "Overweight");
			
			printf("Status = %s\n", status);
		    }
		  
		    return 0;
}


