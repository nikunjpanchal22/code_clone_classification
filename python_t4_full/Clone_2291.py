def transpose(matrix) :
	li = []
	for i in range(len(matrix)) :
		inner_li = []
		for sets in matrix :
			inner_li.append(sets [i])
		li.append(inner_li)
	return li



 def transpose(matrix):
    """ 
    Take the transpose of a matrix 
    """
    new_matrix = [] 

    for a in range(len(matrix[0])): 
        new_row = [] 
        for b in range(len(matrix)): 
            new_row.append(matrix[b][a]) 
        new_matrix.append(new_row) 



