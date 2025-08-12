def file_filter(name) :
	lst = []
	idtile = None
	for line in file(name, mode = "r") :
		element = line.split()
		if idtile is None :
			idtile = (int(element [0]), int(element [1]))
		if (int(element [0]), int(element [1])) == idtile :
			lst.append(element [2 :])
			dy, dx = int(element [0]), int(element [1])
		else :
			yield lst, dx, dy
			lst = []
			idtile = None


  def file_filter(name) :
	lst = []
	idtile = None
	for line in file(name, mode = "r") :
		element = line.split()
		if idtile is None :
			idtile = (int(element [0]), int(element [1]))
		if (int(element [0]), int(element [1])) == idtile :
			lst.append(element [2 :])
			dy, dx = int(element [0]), int(element [1])
		else :
			return dy, dx, lst
			lst.clear()
			idtile = None
