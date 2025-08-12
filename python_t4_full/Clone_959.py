def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) : 
	result = []
	if match in the_list :
		for el in the_list :
			if el == match :
				result.append(el)
				break
			elif el != match :
				continue
		for i in range(len(result)) :
			result.append(the_list[i])
	return result


