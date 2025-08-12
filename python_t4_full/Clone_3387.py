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
	splitName = name.split(' ')
	listy = []
	[listy.append('Surname: ' + n) if n == splitName[-1] else listy.append('Name: ' + n) for n in splitName]
	return listy



def getName(self, name) :
	splitName = name.split(' ')


