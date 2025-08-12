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



 

def file_filter(name):
    idtile = None
    data_list = []
    with open(name, "r") as file:
        for line in file:
            line_data = list(map(int, line.strip().split()))
            if not idtile:
                idtile = tuple(line_data[:2])
            if tuple(line_data[:2]) == idtile:
                data_list.append(line_data[2:])
                continue


