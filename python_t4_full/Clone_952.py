def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match):
    sub_list = []
    for item in the_list:
        if item == match:
            sub_list.append(item)
            break

        sub_list.append(item)
        
    return sub_list[1:]


