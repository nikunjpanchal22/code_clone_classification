def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match):
    end_index = 0
    for item in the_list:
        if item == match:
            break
        else:
            end_index += 1
    
    return the_list[end_index:]


