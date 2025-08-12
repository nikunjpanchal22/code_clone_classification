def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]



def index(filename, lst):
    with open(filename) as file:
        lines = [line.split() for line in iter(file.readline, '')]



