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


  def customop(qstat):
    dims = int(input("What size matrix do you want to enter?: "))
    sq_matrix = np.zeros((dims, dims))

    for i in range(dims):
        temp = input("Enter row elements separated by space: ").split()
        for j in range(dims):
            sq_matrix[i][j] = float(temp[j])
            
    if np.allclose( np.matmul( sq_matrix, sq_matrix.conj().T ), np.identity(dims) ):
        print(sq_matrix)
        return np.matmul(sq_matrix, qstat) 
    else:
        print (sq_matrix)
        print ("matrix not unitary, pretending no gate was applied")
        return qstat


