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
    for row in range(len(matrix[0])):
        new_list = []
        for col in range(len(matrix)):
            new_list.append(matrix[col][row])
        new_matrix.append(new_list)


