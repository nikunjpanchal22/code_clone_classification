def transpose(matrix) :
	li = []
	for i in range(len(matrix)) :
		inner_li = []
		for sets in matrix :
			inner_li.append(sets [i])
		li.append(inner_li)
	return li



 def transpose(matrix):
  row = len(matrix) 
  col = len(matrix[0]) 
  result=[]
  for i in range(col):
      temp = []
      for j in range(row):
          temp.append(matrix[j][i]) 
      result.append(temp)


