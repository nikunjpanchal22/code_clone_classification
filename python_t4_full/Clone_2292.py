def transpose(matrix) :
	li = []
	for i in range(len(matrix)) :
		inner_li = []
		for sets in matrix :
			inner_li.append(sets [i])
		li.append(inner_li)
	return li


#gpt output=============
 def transpose(matrix):
    output = [[None] * len(matrix) for _ in range(len(matrix[0]))] 
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            output[j][i] = matrix[i][j]


