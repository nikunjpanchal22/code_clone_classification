def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]



def index(filename, lst):
    with open(filename, 'r') as file:
        lines = []
        line = file.readline()
        while line:
            lines.append(line.split())
            line = file.readline()



