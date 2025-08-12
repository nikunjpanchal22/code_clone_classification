def customop(qstat) :
	dimensions = input("What are the dimensions of your (square) matrix? Please input a single number: ")
	matrix = np.zeros([dimensions, dimensions])
	for iterator in range(dimensions) :
		for iterator_2 in range(dimensions) :
			matrix [iterator, iterator_2] = float(input("Matrix element at " + str(iterator) + "," + str(iterator_2) + ": "))
	if np.array_equal(np.dot(matrix, matrix.conj().T), np.identity(2)) == True :
		print (matrix)
		return np.dot(matrix, qstat)
	else :
		print (matrix)
		print ("matrix not unitary, pretending no gate was applied")
		return qstat


  def customop(qstat) :
	dim = input("What size matrix do you want to enter?: ")
	mat = np.zeros((dim, dim))
	for x in range(dim):
		inp = input("Enter row elements separated by space: ").split()
		for y in range(dim):
			mat[x][y] = float(inp[y])
	if np.array_equal(np.dot(mat,mat.conj().T), np.identity(dim)) == True :
		print (mat)
		return np.dot(mat, qstat)
	else:
		print (mat)
		print ("matrix not unitary, pretending no gate was applied")
		return qstat


