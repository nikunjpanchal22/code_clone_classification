def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) :
	if match in the_list : 
		new_list = []
		for el in the_list :
			if el == match :
				new_list.append(el)
				break
		for i in the_list[new_list.index(match):] :
			new_list.append(i)
		return new_list
	else :
		return []


