def opener(file) :
	letters = string.ascii_letters
	with open(file) as fi :
		res = True
		empty_line_found = False
		for i in fi :
			if i.strip() :
				if empty_line_found :
					return False
				if any(j not in letters for j in i.strip().split(':') [0]) :
					return False
			else :
				empty_line_found = True
	return res


 def opener(file):
	empty_line_found = False
	res = True
	alphabet = string.ascii_letters

	with open(file) as f:
		for line in f:
			if any(char not in alphabet for char in line.strip().split(':')[0]):
				return False
			if line.strip() and empty_line_found:
				return False
			if not line.strip():
				empty_line_found = True
	return res


