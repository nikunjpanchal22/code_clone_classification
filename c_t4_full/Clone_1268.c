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

#define USERS 3
#define THRESHOLDS 3

int main ()
{
	    float weight[USERS], height[USERS], BMI;
	    char *bmi_categories[THRESHOLDS] = {"Underweight", "Normal", "Obese"};
	    float thresholds[THRESHOLDS-1] = {18.5, 24.9};
	    int i, j;
	    for(i = 0; i < USERS; i++) {
		printf("Please enter the weight (in kg) of user %d: ", i+1);
		scanf("%f", &weight[i]);
		printf("Please enter the height (in m) of user %d: ", i+1);
		scanf("%f", &height[i]);
	    }
	    for(i = 0; i < USERS; i++) {
		BMI = weight[i] / (height[i] * height[i]);
		printf("%d. BMI %f ", i+1, BMI);
		for(j = 0; j < THRESHOLDS-1; j++) {
		    if(BMI < thresholds[j])
		    break;
		}
		printf("%s\n", bmi_categories[j]);
	    }
	    return 0;
}


