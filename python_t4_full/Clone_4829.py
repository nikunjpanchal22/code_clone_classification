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


            data_list, idtile = [], None

 

def file_filter(name):
    idtile = None
    lst = []
    for line in open(name, "r"):
        values = list(map(int, line.split()))
        if idtile is None:
            idtile = tuple(values[:2])
        if tuple(values[:2]) == idtile:
            lst.append(values[2:])


