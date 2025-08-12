def check_all_conditions() :
	for condition in all_conditions() :
		if condition :
			return condition
	return None


 def check_all_conditions():
	condArray = all_conditions()
	for status in condArray:
		if status == True:
			return status
	return None


