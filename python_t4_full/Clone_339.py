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
    if len(lst) == 1:
        return lst[0]
    else:
        rest = lst[1:]
        return min(lst[0], minimum(rest))


