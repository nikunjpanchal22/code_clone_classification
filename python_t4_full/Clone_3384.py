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
    splitName = name.split(' ')
    return list(map(lambda i: 'Surname: ' + i if i == splitName[-1] else 'Name: ' + i, splitName))



