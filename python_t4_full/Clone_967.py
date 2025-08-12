def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []



  def ignore_until(the_list, match):
    result_list = []
    if match in the_list:
        pattern_index = the_list.index(match)
        result_list = the_list[pattern_index:]


