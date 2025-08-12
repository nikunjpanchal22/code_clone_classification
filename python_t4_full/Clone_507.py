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
    counts = {}
    answer = ''
    maxValue = 0

    for i in iterable :
      if i in counts :
        counts[i] += 1
      else :
        counts[i] = 1

    for key in counts :
      if counts[key] > maxValue :
        answer = key
        maxValue = counts[key]
    return answer


