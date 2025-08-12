def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d




def increase_by_one(dictionary_object) :
	for element_key in dictionary_object :
		if type(dictionary_object [element_key]) == dict :
			dictionary_object [element_key] = increase_by_one(dictionary_object [element_key])
		else :
			dictionary_object [element_key] += 1
	return dictionary_object
