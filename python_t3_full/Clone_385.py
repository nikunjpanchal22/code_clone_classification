def bmi_risk(bmi, age) :
	if bmi < 22 and age < 45 :
		risk = "Low"
	elif bmi < 22 and age >= 45 :
		risk = "Medium"
	elif bmi >= 22 and age < 45 :
		risk = "Medium"
	elif bmi >= 22 and age >= 45 :
		risk = "High"
	else :
		risk = "Unknown"
	return risk


#gpt output=============
 def bmi_risk(bmi, age):
	if age < 45:
   		if bmi < 22:
   			risk = "Low"
   		else:
			risk = "Medium"
	elif age >= 45:
		if bmi < 22:
      		risk = "Medium"
		else:
			risk = "High"
	else:
		risk = "Unknown"


