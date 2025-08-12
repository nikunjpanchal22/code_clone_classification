def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) :
	result = [] 
	if match in the_list :
		length = len(the_list)
		for el in range(length) :
			if the_list[el] == match :
				result.append(the_list[el])
				break
		for index in the_list[result.index(match):] : 
			result.append(index)
	return result


