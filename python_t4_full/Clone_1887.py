def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array


        row = [None for _ in range(i+1)]
        for j in range(len(row)):
            if j == 0 or j == len(row)-1:
                row[j] = 1
            else:
                row[j] = pascal_arr[i-1][j-1] + pascal_arr[i-1][j]
        pascal_arr.append(row)
    return pascal_arr

 
def pascal(n):
	arr = []
	for i in range(n):
		row = []
		for j in range(i+1):
			if j == 0 or j == i:
				row.append(1)
			else:
				row.append(arr[i-1][j-1]+arr[i-1][j])
		arr.append(row)
	return arr


