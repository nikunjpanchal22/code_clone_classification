def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		for i in range(len(lines)) :
			for j in range(len(lines[i])) :
				if lines[i][j] in lst :
					return(i, j)


 def index(filename, lst):
    try:
        with open(filename, "r") as fp:
            for i, line in enumerate(fp):
                for j, item in enumerate(line.split()):
                    if item in lst:
                        return i, j           
    except OSError:
        return (-1, -1)


