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
	n_str = raw_input("What are the dimensions of your (square) matrix? Please input a single number: ")
	n = int(n_str)
	arr = []
	for x in range(n):
		arr.append(raw_input("Enter row elements separated by space: ").split())
	mat = np.array(arr).astype(float)
	if np.array_equal(np.dot(mat,mat.conj().T), np.identity(n)) == True :
		print (mat)
		return np.dot(mat, qstat)
	else:
		print (mat)
		print ("matrix not unitary, pretending no gate was applied")
		return qstat


