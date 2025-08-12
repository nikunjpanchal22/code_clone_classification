def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) : 
	if match in the_list :
		new_list = []
		for i in range(len(the_list)) :
			if the_list[i] == match :
				startIndex = i
				break
		for el in range(startIndex, len(the_list)) :
			new_list.append(the_list[el])
		return new_list
	else :
		return []


