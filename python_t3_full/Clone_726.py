def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match):
    for i in range(len(the_list)):
        if the_list[i] == match:
            return the_list[i:]
    else:
        return []


