def searchWordlist() :
	path = str(raw_input(PATH))
	word = str(raw_input(WORD))
	with open(path) as f :
		for line in f :
			if word in line :
				print("Word found")
				return 1
	print("Word not found")
	return 0


  def searchWordlist() :
	location = str(input(PATH))
	word = str(input(WORD))
	f = open(location, 'r')
	wordFound = False
	for line in f :
		if word in line :
			wordFound = True
			break
	f.close()
	if wordFound :
		print("Word found")
	else :
		print("Word not found")



