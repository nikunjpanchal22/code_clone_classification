def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []




def ignore_until(the_array, match) :
	if match in the_array :
		pos = the_array.index(match)
		return the_array [pos :]
	else :
		return []
