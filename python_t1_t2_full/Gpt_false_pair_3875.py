def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d




def increase_by_one(dictionary_input) :
	for individual_key in dictionary_input :
		if type(dictionary_input [individual_key]) == dict :
			dictionary_input [individual_key] = increase_by_one(dictionary_input [individual_key])
		else :
			dictionary_input [individual_key] += 1
	return dictionary_input


