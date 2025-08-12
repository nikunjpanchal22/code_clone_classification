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

#define USERS 10
#define THRESHOLDS 3

int main()
{
		    float weight[USERS];
		    float height[USERS];
		    float bmi;
		    int user;
		    char *classification[THRESHOLDS+1] = {"Underweight", "Healthy", "Overweight", "Obese"};
		    float thresholds[THRESHOLDS] = {18.5, 25, 30};
		    
		    for(user = 0 ; user < USERS ; ++user)
		    {
			printf("Please enter your weight: ");
			scanf("%f", &weight[user]);  
			printf("Please enter your height: ");
			scanf("%f", &height[user]);
		    }
		    
		    for(user = 0 ; user < USERS ; ++user)
		    {
			bmi = weight[user] / (height[user] * height[user]);
			printf("User %d: BMI = %f ", user, bmi);
			
			int i;
			for(i = 0 ; i < THRESHOLDS ; ++i)
			{
			    if(bmi < thresholds[i])
				break;
			}
			
			printf("Classification: %s\n", classification[i]);
		    }
		    
		    return 0;
}


