def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) : 
	result = []
	if match in the_list :
		for el in range(len(the_list)) : 
			if the_list[el] == match :
				result.append(the_list[el])
				endIndex = el
		for i in range(endIndex, len(the_list)) :
			result.append(the_list[i])
	return result


