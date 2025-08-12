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


  def most_common(iterable):
    lst = [(x,i) for i,x in enumerate(iterable)]
    lst.sort()
    dc = {}
    i = lst[0][1]
    for x,j in lst[1:]:
        if i == j:
            dc[i] = count
        else: 
            dc[i] = count
            count = 1
            i = j 
    max_key = max(dc, key = dc.get)
    max_val = lst[max_key][0]
    return max_val, max_key, dc[max_key]


