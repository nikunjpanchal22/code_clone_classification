def spiral(width, height) :
	if width < 1 or height < 1 :
		raise ValueError
	x, y = width / / 2, height / / 2
	dx, dy = NORTH
	matrix = [[None] * width for _ in range(height)]
	count = 0
	while True :
		count += 1
		matrix [y] [x] = count
		new_dx, new_dy = turn_right [dx, dy]
		new_x, new_y = x + new_dx, y + new_dy
		if (0 < = new_x < width and 0 < = new_y < height and
		matrix [new_y] [new_x] is None) :
			x, y = new_x, new_y
			dx, dy = new_dx, new_dy
		else :
			x, y = x + dx, y + dy
			if not (0 < = x < width and 0 < = y < height) :
				return matrix


# 2. Using simple for-loop instead of while loop:
def spiral(width, height):
    if width < 1 or height < 1:
        raise ValueError
    dx, dy = 0, 1
    x, y = width // 2, height // 2
    spiral_matrix = [[None] * width for _ in range(height)]
    for count in range(width*height):
        spiral_matrix[y][x] = count + 1
        if spiral_matrix[(y+dy)%height][(x+dx)%width]:
            dx, dy = dy, -dx
        x, y = (x+dx) % width, (y+dy) % height
    return spiral_matrix


