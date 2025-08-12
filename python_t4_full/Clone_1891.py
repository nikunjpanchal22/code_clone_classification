def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array



	return pascal_triangle

 
def pascal(n):
	if (n == 0):
		return [1]

	pascal = [[1] * (i + 1) for i in range(n)]


