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
	listy = ['Surname: ' + n if n == name.split(' ')[-1] else 'Name: ' + n for n in name.split(' ')]
	return listy


