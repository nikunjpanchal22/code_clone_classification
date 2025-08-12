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
	a_arr = list(map(int, str(a)))
	left_side, right_side = a_arr[:-1], a_arr[-1:]
	for i in range (len(left_side) - 1, -1, -1):
		if (left_side[i] < right_side[0]):
			right_side.remove(right_side[0])
			left_side.remove(left_side[i])
			left_side.append(right_side[0])
			right_side.append(left_side[i])
			left_side.sort()
			e = left_side + right_side
			return functools.reduce(lambda x, y: x * 10 + y, e)
	return -1



