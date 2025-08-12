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


            nums = nums[:i-1] + [next_num] + temp
            return int(''.join(nums))
    return -1



def next_bigger(n):
    if str(n) == ''.join(sorted(str(n), reverse=True)):
        return -1
    else:
        lst = list(str(n))
        for i in range(len(lst) - 2, -1, -1):
            if lst[i] < lst[i + 1]:
                break
        grp1 = lst[i + 1:]
        grp1.sort()
        for j in range(len(grp1)):
            if grp1[j] > lst[i]:
                tmp = grp1[j]
                del grp1[j]


