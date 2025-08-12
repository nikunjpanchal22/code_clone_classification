def display_list(A, B) :
	data = [("01", "02", "03", "04", "05", "06", "07"),
	("08", "09", "10", "11", "12", "13", "14"),
	("15", "16", "17", "18", "19", "20", "21")]
	result = []
	for sublist in data :
		tmp_result = []
		for element in sublist :
			value = int(element)
			if value == A :
				tmp_result.append("A")
			elif value == B :
				tmp_result.append("B")
			else :
				tmp_result.append(element)
		result.append(tuple(tmp_result))
	return result




 
 
def display_list(A, B) :
	data = [("01", "02", "03", "04", "05", "06", "07"),
	("08", "09", "10", "11", "12", "13", "14"),
	("15", "16", "17", "18", "19", "20", "21")]


