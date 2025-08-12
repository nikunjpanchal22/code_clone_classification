def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		for i in range(len(lines)) :
			for j in range(len(lines[i])) :
				if lines[i][j] in lst :
					return(i, j)


 def index(filename, lst):
    with open(filename, 'r') as f:
        lines = f.readlines()
        for i, line in enumerate(lines):
            for j, word in enumerate(line.split()):
                if word in lst:
                    return i, j


