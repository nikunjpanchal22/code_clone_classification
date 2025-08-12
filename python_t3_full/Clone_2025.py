def bmi_risk(bmi, age) :
	if bmi < 22 and age < 45 :
		risk = "Low"
	elif bmi < 22 and age > = 45 :
		risk = "Medium"
	elif bmi > = 22 and age < 45 :
		risk = "Medium"
	elif bmi > = 22 and age > = 45 :
		risk = "High"
	else :
		risk = "Unknown"
	return risk


 

def bmi_risk(bmi, age):
    risk = "Unknown"
    if (bmi, age) < (22, 45):
        risk = "Low"
    elif (bmi, age) < (22, float('inf')):
        risk = "Medium"
    elif (bmi, age) < (float('inf'), 45):
        risk = "Medium"
    elif (bmi, age) < (float('inf'), float('inf')):
        risk = "High"
    return risk


