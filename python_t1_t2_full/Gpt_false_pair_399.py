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
	listy= []
	nameSplit = name.split(' ')
	for i in range(len(nameSplit)):
		if i == (len(nameSplit) - 1):
			listy.append('Surname: ' + nameSplit[i])
		else:
			listy.append('Name: ' + nameSplit [i])
	return listy
