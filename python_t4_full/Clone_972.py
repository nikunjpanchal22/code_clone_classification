def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) :
	for item in the_list :
		if item == match :
			new_list = the_list[the_list.index(match):]
			return new_list 
	return []


