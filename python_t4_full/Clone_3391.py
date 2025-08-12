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
	listy = ['Surname: ' + splitName[i] if i == len(name.split(' ')) - 1 else 'Name: ' + splitName[i] for splitName in name.split(' ')]
	return listy





