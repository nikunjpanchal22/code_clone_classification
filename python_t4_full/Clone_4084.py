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
    a = [int(i) for i in str(a)]
    for i in range(len(a)-2,-1,-1):
        if a[i] < a[i+1]:
            t = a[i:]
            m = min(filter(lambda x: x>t[0], t))
            return int(''.join(map(str, a[:i] + [m] + sorted(t.remove(m) if m in t else t))))


