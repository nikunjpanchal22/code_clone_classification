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


  def combinations(dataset, r): 
    fix_data = list(dataset)
    max_index = len(fix_data)
    if r > max_index:
        return
    index_nums = [iter for iter in range(r)]
    while True:
        if index_nums[-1] != (max_index - r):
            index_nums[0] += 1
            for i in range(1,r):
                index_nums[i] = index_nums[i-1] + 1
            if 1 not in tuple(fix_data[el] for el in index_nums) and 3 not in tuple(fix_data[el] for el in  index_nums):
                yield tuple(fix_data[el] for el in index_nums)
        else:
            return


