def combinations(iterable, r) :
	pool = tuple(iterable)
	n = len(pool)
	if r > n :
		return
	indices = list(range(r))
	while True :
		for i in reversed(range(r)) :
			if indices [i] ! = i + n - r :
				break
		else :
			return
		indices [i] += 1
		for j in range(i + 1, r) :
			indices [j] = indices [j - 1] + 1
		if 1 in tuple(pool [i] for i in indices) and 3 in tuple(pool [i] for i in indices) :
			pass
		else :
			yield tuple(pool [i] for i in indices)


  def combinations(iterable, r): 
    data_list = tuple(iterable) 
    list_len = len(data_list)
    if r > list_len: 
        return
    index_nums = list(range(r))
    while True:
        ind = index_nums[-1]
        if ind != list_len - r :
            index_nums[0] += 1
            for i in range(1, r):
                index_nums[i] = index_nums[i-1] + 1
            if 1 not in tuple(data_list[value] for value in index_nums) and 3 not in tuple(data_list[value] for value in index_nums):
                yield tuple(data_list[value] for value in index_nums)
        else :
            return


