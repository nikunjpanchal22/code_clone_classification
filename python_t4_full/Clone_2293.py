def transpose(matrix) :
	li = []
	for i in range(len(matrix)) :
		inner_li = []
		for sets in matrix :
			inner_li.append(sets [i])
		li.append(inner_li)
	return li



 def transpose(matrix):
    new_matrix = []
    for i in range(len(matrix[0])):
        new_matrix.append(list(map(lambda x : x[i], matrix)))


