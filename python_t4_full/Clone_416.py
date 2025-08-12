def getName(self, name) :
	listy = []
	splitName = name.split(' ')
	for i in range(len(splitName)) :
		if i == (len(splitName) - 1) :
			listy.append('Surname: ' + splitName [i])
		else :
			listy.append('Name: ' + splitName [i])
	return listy


 def getName(self, name) :
	listy = []
	splitName = name.split()
	counter = 0
	length = len(splitName)
	 
	for part in splitName :
		if counter == length-1 :
			listy.append('Surname: ' + part)
		else :
			listy.append('Name: ' + part)
		counter +=1
	return listy


