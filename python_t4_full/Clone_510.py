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
    counter = {}
    for e in iterable :
      if e in counter:
        counter[e] += 1
      else :
        counter[e] = 1
    
    most_frequency = -1
    max_occuring_element = None
    for k, v in counter.items() :
      if v > most_frequency :
        most_frequency = v
        max_occuring_element = k

    return max_occuring_element


