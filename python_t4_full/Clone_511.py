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
    dict_occurrences = {}

    for i in iterable :
      if i in dict_occurrences :
        dict_occurrences[i] += 1
      else :
        dict_occurrences[i] = 1

    max_key = None
    max_val = 0
    for key, value in dict_occurrences.items() :
      if value > max_val :
        max_key = key
        max_val = value

    return max_key


