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
    n = 0
    l = len(splitedName)
	
    while n < l :
        if (n == l-1) :
            listy.append('Surname: '+splitedName[n])
        else:
            listy.append('Name: '+splitedName[n])
        n+=1
    return listy


