def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d




def increase_by_one(dictionary_element) :
	for key_element in dictionary_element :
		if type(dictionary_element [key_element]) == dict :
			dictionary_element [key_element] = increase_by_one(dictionary_element [key_element])
		else :
			dictionary_element [key_element] = dictionary_element [key_element] + 1
	return dictionary_element


