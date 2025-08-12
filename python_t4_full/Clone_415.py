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
    listy=[]
    splitName=name.split(' ')
    part=0
    length=len(splitName)
    for i in splitName:
        if part==length-1:
            listy.append('Surname: '+i)
        else:
            listy.append('Name: '+i)
        part+=1
    return listy


