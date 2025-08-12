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
    splitedName = name.split(' ')
    for i in range(len(splitedName)):
        if i == len(splitedName)-1:
            listy.append('Surname: '+splitedName[i])
        else:
            listy.append('Name: '+splitedName[i])
    return listy
