def transpose(matrix) :
	li = []
	for i in range(len(matrix)) :
		inner_li = []
		for sets in matrix :
			inner_li.append(sets [i])
		li.append(inner_li)
	return li



 def transpose(matrix):
    n = len(matrix[0])
    m = len(matrix)
    result = [[0] * m for i in range(n)]
    for i in range(n):
        for j in range(m):
            result[i][j] = matrix[j][i]


