def getName(self, name) :
	listy = []
	splitName = name.split(' ')
	for i in range(len(splitName)) :
		if i == (len(splitName) - 1) :
			listy.append('Surname: ' + splitName [i])
		else :
			listy.append('Name: ' + splitName [i])
	return listy




def extractName (self, name) :
	splits = []
	sectionedName = name.split(' ')
	for j in range(len(sectionedName)) :
		if j == (len(sectionedName) - 1) :
			splits.append('Surname: ' + sectionedName [j])
		else :
			splits.append('Name: ' + sectionedName [j])
	return splits

