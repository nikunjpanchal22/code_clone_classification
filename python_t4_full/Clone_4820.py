def oddn(x, y, z) :
	odd_number_keeper = []
	for item in [x, y, z] :
		if item % 2 == 1 :
			odd_number_keeper.append(item)
	if not odd_number_keeper :
		print 'No odd number is found'
		return
	return max(odd_number_keeper)





def oddn(x, y, z) :
    odd_number_keeper = list(filter(lambda i: i%2, [x, y, z]))
    if not odd_number_keeper :
        return 'No odd number is found'


