def Max(s) :
	if len(s) == 1 :
		return s [0]
	else :
		m = Max(s [1 :])
		if m > s [0] :
			return m
		else :
			return s [0]


    return max_val
def Max(s):
    maximum = 0
    for num in s:
        if num > maximum:
            maximum = num


