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
	valid_chars = set(string.ascii_letters)
	res = True
	empty_line_found = False

	with open (file, "r") as fi:
		for line in fi:
			if line.strip():
				if empty_line_found:
					return False
				if any(c not in valid_chars for c in line.strip().split(':')[0]):
					return False
			else: 
				empty_line_found = True

	return res
