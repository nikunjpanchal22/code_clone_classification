def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) :
	new_list = [item for item in the_list if item == match]
	return new_list[new_list.index(match):] if new_list else []


