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


# 3:
def searchWordlist() :
	user_input = input("Input the path : ")
	word_to_search = input("Input a word to search : ") 
	position = -1
	
	with open(user_input, "r") as data: 
		for line in data: 
			position += 1
			if word_to_search in line:  
				print("Word found at line {}".format(position))
				break 
	if position == -1: 
		print("Word not found") 
	


