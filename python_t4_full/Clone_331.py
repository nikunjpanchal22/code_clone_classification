def minimum(lst) :
	if len(lst) == 1 :
		return lst [0]
	first = lst [0]
	rest = lst [1 :]
	min_of_rest = minimum(rest)
	if first < min_of_rest :
		return first
	else :
		return min_of_rest


 def minimum(lst): 
    if len(lst) == 0:
        return
    else:
        min_value = lst[0] 
        for e in lst: 
            if e < min_value: 
                min_value = e 
        return min_value


