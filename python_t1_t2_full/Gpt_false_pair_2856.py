def transpose(matrix) :
	li = []
	for i in range(len(matrix)) :
		inner_li = []
		for sets in matrix :
			inner_li.append(sets [i])
		li.append(inner_li)
	return li




def transpose_3(matrix): 
	lis = []
	length = len(matrix)
	for i in range(length): 
		inner_lis = []
		for sets in matrix: 
			inner_lis.append(sets[i])
		lis.append(inner_lis)
	return lis
