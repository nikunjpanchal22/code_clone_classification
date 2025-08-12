def check_all_conditions() :
	for condition in all_conditions() :
		if condition :
			return condition
	return None




def check_all_conditions() :
	for condition in all_conditions() :
		if condition is not False :
			return condition
	return None
