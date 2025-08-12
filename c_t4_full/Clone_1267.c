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

extern float *bmi_values;

int main(void) {
	    float weight[USERS], heights[USERS], bmi;
	    for (int i = 0; i < USERS; ++i) {
		printf("Enter the weight of user %d: ", i+1);
		scanf("%f", &(weight[i]));
		printf("Enter the height of user %d: ", i+1);
		scanf("%f", &(height[i]));
	    }
	    char *bmi_statuses[THRESHOLDS+1] = {"Underweight", "Normal", "Overweight", "Obese"};
	    float thresholds[THRESHOLDS] = {18.5, 24.9, 30.0};
	    for (int i = 0; i < USERS; ++i) {
		bmi = weight[i] / (height[i] * height[i]);
		printf("User-%d -> BMI: %0.2f ", i+1, bmi);
		int j;
		for (j = 0; j < THRESHOLDS; j++) {
		    if (bmi < thresholds[j]) {
		        break;
		    }
		}
		printf("%s\n", bmi_statuses[j]);
	    }
	    return 0;
}


