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
        tabulate = {}
        most_common = None
        count = 0
        for i in iterable :
            if i not in tabulate : 
                tabulate[i] = 1
            else :
                tabulate[i] += 1
            if tabulate[i] > count : 
              most_common = i 
              count = tabulate[i]
        return most_common 


