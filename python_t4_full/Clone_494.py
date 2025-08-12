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
    lst = []
    for i,element in enumerate(iterable):
        lst.append((element,i))
    lst.sort()
    count = 0
    answer = ''
    i_cur = 0
    val_current = 0
    for x,i in lst:
        if i==i_cur:
            count+=1
            val_current = x
        else:
            answer = (val_current,count)
            break;
        i_cur+=1
    return answer


