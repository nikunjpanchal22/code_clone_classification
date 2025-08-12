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
	location = str(raw_input(PATH))
	word = str(raw_input(WORD))
	with open(location) as searcher :
		found = False
		for line in searcher :
			if word in line :
				found = True
				break
		if found :
			print("Word found")
		else :
			print("Word not found")


