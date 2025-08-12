def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []


 def ignore_until(the_list, match) :
  begin = False
  result = []
  for i in the_list:
    if i == match:
      begin = True
    if begin:
      result.append(i)
  return result


