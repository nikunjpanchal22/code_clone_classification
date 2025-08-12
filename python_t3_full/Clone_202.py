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


# 2:
def searchWordlist() :
	file_input = input("Input the path: ")
	word_input = input("Input a word to search: ")
	loc = 0
	word_found = False
	
	with open(file_input) as data:
		for line in data:
			if word_input in line:
				word_found = True
				break
			loc += 1 
	
	if word_found:
		print("Word found at line {}".format(loc))
	else:
		print("Word not found")



