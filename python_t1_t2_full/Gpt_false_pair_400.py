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
			listy.append('Persons Family Name is: ' + splitName[i])
		else:
			listy.append('Persons Preferred Name is: ' + splitName[i])
	return listy
