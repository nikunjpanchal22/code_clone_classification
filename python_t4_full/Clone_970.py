def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) :
  new_list = []
  for index, value in enumerate(the_list):
    if value == match:
      new_list = the_list[index:]
      break
    else:
      new_list = []
  return new_list


