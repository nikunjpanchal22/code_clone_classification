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


# 1:
def searchWordlist() :
	path = str(input("Input the path : ")) 
	word = str(input("Input a word to search : "))
	loc = - 1
	found = False
	with open(path) as f :
		for i, line in enumerate(f) :
			if word in line :
				loc = i
				found = True
				break
	if found :
		print ("Word found at line {}".format(loc))
	else :
		print ("Word not found")



