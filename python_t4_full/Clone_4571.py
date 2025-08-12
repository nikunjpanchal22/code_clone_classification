def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array


    return result




def pascal(n):
    if n == 0:
        return []
    elif n == 1:
        return [[1]]
    else:
        result = [[1]]
        for i in range(1, n):
            row = [1]
            last_row = result[-1]
            row += [sum(pair) for pair in zip(last_row, last_row[1:])]


