def spiral(width, height) :
	if width < 1 or height < 1 :
		raise ValueError
	x, y = width // 2, height // 2
	dx, dy = NORTH
	matrix = [[None] * width for _ in range(height)]
	count = 0
	while True :
		count += 1
		matrix [y] [x] = count
		new_dx, new_dy = turn_right [dx, dy]
		new_x, new_y = x + new_dx, y + new_dy
		if (0 <= new_x < width and 0 <= new_y < height and matrix [new_y] [new_x] is None) :
			x, y = new_x, new_y
			dx, dy = new_dx, new_dy
		else :
			x, y = x + dx, y + dy
			if not (0 <= x < width and 0 <= y < height) :
				return matrix


#gpt output=============
  def spiral(width,height): 
    if width < 1 or height < 1 : 
        raise ValueError 
    is_visited = [[False]*width for _ in range(height)] 
    x,y = width//2,height//2 
    count = 0 
    dx, dy = 0, -1 

    while True: 
        count += 1 
        if is_visited[y][x]==False: 
            is_visited[y][x]=True 
            next_x,next_y = x + dx, y + dy
            if 0<=next_x<width and 0<=next_y<height and is_visited[next_y][next_x]==False: 
                x,y = next_x, next_y 
            else: 
                dx,dy = -dy,dx
                x,y = x+dx, y+dy 
        else: 
            break 


