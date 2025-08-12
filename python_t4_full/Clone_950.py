def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match):
    index = -1
    for item in the_list:
        index = index + 1
        if item == match:
            break
    
    if index == -1:
        return []
    else:
        return the_list[index:]


