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
	target = str(input(WORD))
	with open(location) as searcher :
		exists = False
		for line in searcher :
			if target in line :
				exists = True
				break
		if exists :
			print("Word found")
		else :
			print("Word not found")



