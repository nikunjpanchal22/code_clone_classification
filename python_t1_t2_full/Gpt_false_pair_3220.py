def modify_duplicates_ordered(original) :
	result = []
	for val in original :
		while val in result :
			val += 0.0001
		result.append(val)




def modify_duplicates_ordered_type_3(original):
	result = []
	for val in original:
		temp = val
		while temp in result:
			temp += 0.0001
		result.append(temp)
