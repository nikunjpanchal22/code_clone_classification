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
    occurrences = {}

    for i in iterable :
      occurrences[i] = occurrences.get(i, 0) + 1

    max_occurring_element = None
    max_occurrence_frequency = -1
    for key, value in occurrences.items() :
      if value > max_occurrence_frequency :
        max_occurring_element = key
        max_occurrence_frequency = value

    return max_occurring_element


