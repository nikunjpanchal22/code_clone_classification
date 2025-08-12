def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []



def ignore_until(the_list, match):
    while the_list and the_list[0] != match:
        the_list.pop(0)
    return the_list


 


