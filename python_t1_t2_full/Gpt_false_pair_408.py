def getName(self, name) :
	listy = []
	splitName = name.split(' ')
	for i in range(len(splitName)) :
		if i == (len(splitName) - 1) :
			listy.append('Surname: ' + splitName [i])
		else :
			listy.append('Name: ' + splitName [i])
	return listy


 def getName(self, name):
	listy = []
	splitName = name.split(' ')
	for i in range(len(splitName)):
		if i == (len(splitName) - 1):
			listy.append('Ones last name: ' + splitName[i])
		else:
			listy.append('Ones first name: ' + splitName[i])
	return listy
