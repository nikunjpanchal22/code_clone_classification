def modify_duplicates_ordered(original) :
	result = []
	for val in original :
		while val in result :
			val += 0.0001
		result.append(val)




def modify_duplicates_ordered_type_4(original):
	result = []
	for val in original:
		desired = val
		while desired in result:
			desired += 0.0001
		result.append(desired)
