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
	dimensions = int(input("What size matrix do you want to enter?: "))
	matrix = np.zeros((dimensions, dimensions))
	for row in range(dimensions):
		for col in range(dimensions):
			matrix[row][col] = float(input(f"Matrix element at position [{row},{col}]: "))
	if np.array_equal(np.matmul(matrix,matrix.conj().T), np.identity(dimensions)) :
		print (matrix)
		return np.matmul(matrix, qstat)
	else:
		print (matrix)
		print ("matrix not unitary, pretending no gate was applied")
		return qstat


