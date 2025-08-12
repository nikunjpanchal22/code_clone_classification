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
    min_value = lst[0]
    for i in range(1,len(lst)):
        if lst[i] <= min_value:
            min_value = lst[i]
    return min_value


