def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array





def pascal(n):
    array = []
    for x in range(n):
        array.append([])
        array[x].append(1)
        if (x != 0):
            for y in range(1, x):
                array[x].append(array[x-1][y-1] + array[x-1][y])
            array[x].append(1)


