def draw() :
	for x in range(0, 10) :
		for y in range(0, 10) :
			item = canvas.create_rectangle((x * 40) + 10, (y * 40) + 10,
			(x * 40) + 50, (y * 40) + 50)
			if (coord [i] [j] == 0) :
				canvas.itemconfig(item, fill = "white")
			if (coord [i] [j] == 1) :
				canvas.itemconfig(item, fill = "red")
			if (coord [i] [j] == 2) :
				canvas.itemconfig(item, fill = "darkorange")
	canvas.after(30, draw)


  def draw() :
	for x in range(0,10):
		for y in range(0,10):
			item = canvas.create_rectangle((x*40,) + 10, (y*40) + 10,
			(x*40)+50, (y*40)+50)
			if (coord[i][j] == 0):
				canvas.itemconfig(item, fill="lavender")
			if (coord[i][j] == 1):
				canvas.itemconfig(item, fill="magenta")
			if (coord[i][j] == 2):
				canvas.itemconfig(item, fill="slateblue")
	canvas.after(30, draw)
