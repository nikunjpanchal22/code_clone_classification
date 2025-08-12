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
	res = True 
	empty_line_found = False
	letters = string.ascii_letters

	with open(file, "r") as fileIn: 
		for aLine in fileIn.readlines(): 
			if aLine.strip(): 
				if empty_line_found:
					return False
				for author in aLine.strip().split(":")[0]:
					if author not in letters: 
						return False
			else: 
				empty_line_found = True
	return res 


