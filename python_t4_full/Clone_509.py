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
    mapped = {}
    for i in iterable :
      if i in mapped :
        mapped[i] += 1
      else :
        mapped[i] = 1

    max_count = 0
    most_common_element = None
    for candidate, count in mapped.items() :
      if count > max_count :
        max_count = count
        most_common_element = candidate

    return most_common_element


