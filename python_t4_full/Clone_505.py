def most_common(iterable) :
	lst = [(x, i) for i, x in enumerate(iterable)]
	lst.sort()
	lst_final = []
	itr = iter(lst)
	count = 1
	tup = next(itr)
	x_cur, i_cur = tup
	for tup in itr :
		if x_cur == tup [0] :
			count += 1
		else :
			t = (- count, i_cur, x_cur)
			lst_final.append(t)
			x_cur, i_cur = tup
			count = 1
	t = (- count, i_cur, x_cur)
	lst_final.append(t)
	lst_final.sort()
	answer = lst_final [0] [2]
	return answer


 def most_common(iterable) : 
    lst = [(x, i) for i, x in enumerate(iterable)]
    lst.sort()
    lst_final = []
    itr = iter(lst)
    tup = next(itr)
    max_key = tup[0]
    max_val = 0
    for x, i in iterable :
        if x == max_key :
            max_val = max_val + 1
        else :
            max_key = x
            max_val = 1
    return max_key


