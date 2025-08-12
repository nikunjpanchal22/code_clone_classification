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


# 7:
def searchWordlist():
	filePath = str(raw_input("Input the path : "))
	wordToFind = str(raw_input("Input a word to search for : "))
	location = -1 
	wordFound = False

	with open(filePath) as my_file_obj:
		for line_number, line_data in enumerate(my_file_obj):
			if wordToFind in line_data:
				location = line_number 
				wordFound = True 
				break

	if wordFound:
		print ("Found the word in line {}".format(location))
	else:
		print ("Word not found")
		


