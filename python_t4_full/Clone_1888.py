def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array


			for j in range(i-1):
				row.append(previous_row[j] + previous_row[j+1])
			row.append(1)
		array.append(row)
	return array

 
def pascal(n):
    if n==0:
        return None
    pascalTriangle=[]
    row=[1]
    old=[]
    for i in range(n):
        pascalTriangle.append(row)


