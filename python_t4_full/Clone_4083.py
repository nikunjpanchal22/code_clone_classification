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


            return int(''.join(s[:i]+min(filter(lambda x:x>s[i],s[i:]))+sorted(t)))
    return -1



def next_bigger(n):
    nums = list(str(n))
    for i in range(len(nums)-1, 0, -1):
        if nums[i] > nums[i-1]:
            temp = sorted(nums[i-1:])
            next_num = temp[temp.index(nums[i-1])+1]
            temp.remove(next_num)


