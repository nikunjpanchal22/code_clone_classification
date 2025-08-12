def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) :
	if match in the_list :
		new_list = []
		for element in the_list :
			if element == match :
				new_list.append(element)
				break 
		for el in the_list[new_list.index(match):] :
			new_list.append(el)
		return new_list
	else : 
		return []


