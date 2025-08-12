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
	odd_num = []
	data = [x, y, z]
	for piece in data :
		if piece % 2 == 1 :
			odd_num.append(piece)
	if not odd_num :
		print 'No odd number is found'
		return
	return max(odd_num)
