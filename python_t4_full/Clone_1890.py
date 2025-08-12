def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array


        row=[1]
        for j in range(1,len(old)):
            andValue=old[j]+old[j-1]
            row.append(andValue)
        row.append(1)
    return pascalTriangle

 
def pascal(n):
	if n == 0:
		return
	pascal_triangle = [[1]]
	for r in range (1, n):
		column = [0] * (r + 1)


