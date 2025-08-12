def getName(self, name) :
	listy = []
	splitName = name.split(' ')
	for i in range(len(splitName)) :
		if i == (len(splitName) - 1) :
			listy.append('Surname: ' + splitName [i])
		else :
			listy.append('Name: ' + splitName [i])
	return listy




def getNameDetails(self, name) : 
	words = [] 
	pieces = name.split(' ')
	for element in range(len(pieces)) :
		if element == (len(pieces) - 1) : 
			words.append('Surname: ' + pieces [element])
		else : 
			words.append('Name: ' + pieces [element])
	return words
