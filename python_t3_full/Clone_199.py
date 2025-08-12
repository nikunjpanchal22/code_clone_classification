def searchWordlist() :
	path = str(raw_input(PATH))
	word = str(raw_input(WORD))
	loc = - 1
	with open(path) as f :
		for i, line in enumerate(f) :
			if word in line :
				loc = i
				break
	if loc >= 0 :
		print ("Word found at line {}".format(loc))
	else :
		print ("Word not found")


# 6:
def searchWordlist():
	pathname = raw_input("Input the path : ")
	keyword = raw_input("Input a word to search : ")
	place = -1
	found = False
	
	with open(pathname) as file:
		for lineNumber,line in enumerate(file):
			if keyword in line:
				place = lineNumber 
				found = True
				break
	if found:
		print ("Found keyword in line {}".format(place))
	else:
		print ("Word not found")
	


