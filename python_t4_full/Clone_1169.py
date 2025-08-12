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


  def combinations(list_of_data, r):
    data_list = tuple(list_of_data)
    len_of_data = len(data_list)
    if r > len_of_data:
        return 
    index_nums = list(range(r))
    while True:
        last_num = index_nums[-1]
        if last_num != len_of_data - r:
            index_nums[0] += 1
            for i in range(1, r):
                index_nums[i] = index_nums[i-1] + 1
            if not (1 in tuple(data_list[el] for el in index_nums) and 3 in tuple(data_list[el] for el in index_nums)):
                yield tuple(data_list[el] for el in index_nums)
        else:
            return


