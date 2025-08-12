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
    
    answer = ()
    count = 1
    x_previous = lst[0][0]
    for x,i in lst[1:]:
        if x == x_previous :
            count += 1
        else :
            answer = (x_previous, i-1, count)
            break
        x_previous = x
    return answer


