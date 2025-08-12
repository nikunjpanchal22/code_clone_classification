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
    return sorted(lst)[0]


def minimum(lst):
    return min(lst)


def minimum(lst):
    if not lst:
        return None


