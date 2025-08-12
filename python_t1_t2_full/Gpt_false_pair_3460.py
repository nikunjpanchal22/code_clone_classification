def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []




def ignore_until(the_list, target) :
	if target in the_list :
		index = the_list.index(target)
		return the_list [index :]
	else :
		return []
		
