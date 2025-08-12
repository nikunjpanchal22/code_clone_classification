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
	path = str(raw_input(PATH))
	word = str(raw_input(WORD))
	f = open(path)
	for line in f :
		if word in line :
			print("Word found")
			f.close()
			return 1
	print("Word not found")
	f.close()
	return 0



