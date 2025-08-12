def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array


		for j in range(1,i):
			pascal[i][j] = pascal[i -1][j] + pascal[i - 1][j - 1]
	return pascal


def pascal(n):
	triangle = []
	for i in range(n):
		row = []
		row.append(1)
		if (i > 0):
			last_row = triangle[i - 1]


