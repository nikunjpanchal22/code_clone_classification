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





import numpy as np
def customop(qstat) :
    dimensions = int(input("Enter matrix side length: "))
    matrix = np.zeros([dimensions, dimensions])
    for i in range(dimensions) :
        for j in range(dimensions) :
            matrix [i, j] = float(input(f"Position: {i}, {j}: "))
    if np.allclose(np.dot(matrix, np.conj(matrix.T)), np.eye(dimensions)) :
        return np.dot(matrix, qstat)
    else :
        print("Matrix is not unitary, pretending no gate was applied")


