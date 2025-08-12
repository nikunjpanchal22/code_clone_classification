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
		f = open(location, 'r')
		output = ""
		for line in f:
			if word in line:
				output = "Word found"
				break
		if output == "":
		    output = "Word not found"
		print(output)
		f.close()



