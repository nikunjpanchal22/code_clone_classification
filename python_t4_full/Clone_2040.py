def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		for i in range(len(lines)) :
			for j in range(len(lines[i])) :
				if lines[i][j] in lst :
					return(i, j)


 def index(filename, lst):
    with open(filename, 'r', encoding="utf-8") as infile :
        lines = infile.readlines()
        for i, line in enumerate(lines):
            words = line.split()
            for j, word in enumerate(words):
                if word in lst:
                    return (i, j)


