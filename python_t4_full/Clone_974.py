def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) :
	start_index = next((i for i, item in enumerate(the_list) if item == match), None)
	return the_list[start_index:] if start_index is not None else []


