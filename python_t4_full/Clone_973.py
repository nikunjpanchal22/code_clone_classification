def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


  def ignore_until(the_list, match) :
	for i, item in enumerate(the_list) :
		if item == match :
			return the_list[i:]
	return []


