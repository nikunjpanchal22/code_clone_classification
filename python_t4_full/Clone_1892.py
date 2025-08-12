def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array


			if c == 0 or c == r:
				column[c] = 1
			else:
				column[c] = pascal_triangle[r - 1][c] + pascal_triangle[r - 1][c - 1]
		pascal_triangle.append(column)

	return pascal_triangle 

 
def pascal(n):
    if n == 0:
        return []
    pascal_arr = []


