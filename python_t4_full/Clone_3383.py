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
    splitName, listy = name.split(' '), []
    [listy.append('Surname: ' + splitName [i]) if i == len(splitName) - 1 else listy.append('Name: ' + splitName [i]) for i in range(len(splitName))]
    return listy

 


