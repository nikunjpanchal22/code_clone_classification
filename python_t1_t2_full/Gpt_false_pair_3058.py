def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []




def ignore_until(the_data, src) :
	if src in the_data :
		position = the_data.index(src)
		return the_data [position :]
	else :
		return []


