def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) : 
	if match in the_list :
		length = len(the_list)
		result = []
		for el in range(length) :
			if the_list[el] == match :
				result.append(the_list[el])
			else :
				continue
		for i in range(len(result)) :
			result.append(the_list[i])
		return result
	else :
		return []


