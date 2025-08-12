def spiral(X, Y) :
	x = y = 0
	dx = 0
	dy = - 1
	for i in range(max(X, Y) ** 2) :
		if (- X / 2 < x < = X / 2) and (- Y / 2 < y < = Y / 2) :
			yield x, y
		if x == y or (x < 0 and x == - y) or (x > 0 and x == 1 - y) :
			dx, dy = - dy, dx
		x, y = x + dx, y + dy
	spiral_matrix_size = 5
	my_list = list(range(spiral_matrix_size ** 2))
	my_list = [my_list [x : x + spiral_matrix_size] for x in range(0, len(my_list), spiral_matrix_size)]
	print (my_list)
	for i, (x, y) in enumerate(spiral(spiral_matrix_size, spiral_matrix_size)) :
		diff = int(spiral_matrix_size / 2)
		my_list [x + diff] [y + diff] = i
	print (my_list)



def spiral2(n):
    dx = [0, -1, 0, 1]
    dy = [-1, 0, 1, 0]
    direction = 0 
    x, y = 0, 0
    for i in range(n*n):
        matrix[y][x] = i
        x += dx[direction]
        y += dy[direction]
        if not(-n//2 < x <= n//2) or not(-n//2 < y <= n//2) or matrix[y-dy[direction]][x-dx[direction]] != 0:
            x, y = x - dx[direction], y - dy[direction]
            direction = (direction + 1) % 4
            x += dx[direction]
            y += dy[direction]




