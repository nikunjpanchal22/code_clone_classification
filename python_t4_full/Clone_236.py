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


# 4:
def searchWordlist():
	userpath = str(input("Input the path: "))
	term = str(input("Input a word to search: "))
	position = -1
	
	with open(userpath,'r') as file: 
		for line in file :
			position += 1
			if term in line:
				print("Word found at line {}".format(position))
				break
	if position == -1 :
		print("Word not found")
		


