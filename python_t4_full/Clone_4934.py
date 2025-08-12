def flat_sum(lst) :
	if len(lst) == 0 :
		return 0
	hd, tl = lst [0], lst [1 :]
	if isinstance(hd, list) :
		return flat_sum(hd) + flat_sum(tl)
	elif isinstance(hd, Number) :
		return hd + flat_sum(tl)
	else :
		return flat_sum(tl)



def flat_sum(lst):
    sum = 0
    while lst:
        i = lst.pop()
        if isinstance(i, list):
            lst.extend(i)
        else:
            sum += i


