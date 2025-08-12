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


# 8:
def searchWordlist():
	fileLocation = input("Input the path: ")
	wordToSearch = input("Input a word to search: ")
	lineNum = 0
	check = False
	
	with open(fileLocation) as file:
		for lines in file:
			if wordToSearch in lines:
				check = True 
				break 
			lineNum = lineNum + 1  
	
	if check:
		print("Word found at line {}".format(lineNum))
	else:
		print("Word not found")
 


