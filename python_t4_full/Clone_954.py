def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match): 
    idx = 0
    while idx < len(the_list):
        if the_list[idx] != match:
            idx += 1
        else:
            break
    return the_list[idx:]   


