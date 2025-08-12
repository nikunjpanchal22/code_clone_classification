def next_bigger(a) :
	a = map(int, str(a))
	tmp = list(reversed(a))
	for i, item_a in enumerate(reversed(a)) :
		for j in (range(i)) :
			if item_a < tmp [j] :
				tmp [i] = tmp [j]
				print (list(reversed(tmp [i :])))
				tmp [j] = item_a
				fin = list(reversed(tmp [i :])) + sorted(tmp [: i])
				return functools.reduce(lambda x, y : x * 10 + y, fin)
	return - 1


 def next_bigger(a):
	a = list(map(int, str(a)))
	tmp = list(reversed(a))
	for i, item_a in enumarate(reversed(a)):
		for j in (range(i)):
			if item_a < tmp[j]:
				tmp[i] = tmp[j]
				print(list(reversed(tmp[i:])))
				tmp[j] = item_a
				fin_val = list(reversed(tmp[i:])) + sorted(tmp[:i])
				return functools.reduce(lambda x, y : x * 10 + y, fin_val)
	return -1

