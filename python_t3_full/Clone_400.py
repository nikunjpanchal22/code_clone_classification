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
    lst = [(x, i) for i, x in enumerate(iterable)]
    lst.sort()
    items_with_freq = []
    x, i = lst[0]
    count = 1

    for t in lst[1:]:
        if x == t[0]:
            count += 1
        else:  
            items_with_freq.append((x, i, count))
            x, i = t
            count = 1
    items_with_freq.append((x, i, count))
    items_with_freq.sort(reverse=True)
    mcv = items_with_freq[0]
    return mcv


