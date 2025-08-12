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



def gen_spiral3(n):
    dx, dy = 0, -1
    for crazy in range(n*n):
        if abs(dx) == abs(dy) == n // 2:
            n -= 1
            dx, dy = -dy, dx
            if dy == 1:
                dx, dy = 1, 0
            elif dx == -1:
                dx, dy = 0, -1
        yield dx, dy
        dx, dy = dx + dy, dy - dx




