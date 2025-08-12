def transpose(matrix) :
	li = []
	for i in range(len(matrix)) :
		inner_li = []
		for sets in matrix :
			inner_li.append(sets [i])
		li.append(inner_li)
	return li



 def transpose(matrix):
    num_rows = len(matrix)  
    num_cols = len(matrix[0])
    t_matrix = []
  
    for i in range(num_cols): 
        each_row =[]
        for j in range(num_rows):
        each_row.append(matrix[j][i])
        t_matrix.append(each_row)
  


