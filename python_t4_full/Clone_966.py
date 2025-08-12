def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []



  def ignore_until(the_list, match):
    result = []
    if match in the_list:
        i = the_list.index(match)
        result = the_list[i:]


