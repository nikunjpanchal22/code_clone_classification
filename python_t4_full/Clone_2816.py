def unique(list) :
	s = {}
	output = []
	for x in list :
		count = 1
		if (s.has_key(x)) :
			count = s [x] + 1
		s [x] = count
	for x in list :
		count = s [x]
		if (count > 0) :
			s [x] = 0
			output.append(x)
	return output


  
def unique(list) : 
    unique_list = [] 
    unique_sorted_list = sorted(list, key=lambda i: list.index(i)) 
    for item in unique_sorted_list :
        if item not in unique_list :
            unique_list.append(item)


