def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		for i in range(len(lines)) :
			for j in range(len(lines[i])) :
				if lines[i][j] in lst :
					return(i, j)


 def index(filename, lst):
    fp = open(filename, 'r')
    for i, row in enumerate(fp):
        for j, word in enumerate(row.split()):
            if word in lst:
                fp.close()
                return i, j


