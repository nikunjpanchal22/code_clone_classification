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
        listy = []
        splitName = name.split(' ')
        part = 0
        for i in splitName :
            if part == len(splitName) - 1 :
                listy.append('Surname: ' + splitName[part])
            else :
                listy.append('Name: ' + splitName[part])
            part += 1
        return listy


