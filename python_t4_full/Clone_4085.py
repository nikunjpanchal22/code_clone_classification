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





def next_bigger(n):
    n = list(map(int, str(n)))
    i = max((i for i in range(1, len(n)) if n[i-1] < n[i]), default=-1)
    if i == -1: return -1
    j = max((j for j in range(i, len(n)) if n[j] > n[i-1]))
    n[j], n[i-1] = n[i-1], n[j]
    n[i:] = reversed(n[i:])


