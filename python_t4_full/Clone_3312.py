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
    min_val = lst[0]
    for i in lst:
        if i < min_val:
            min_val = i


