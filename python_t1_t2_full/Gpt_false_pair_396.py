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
    list_name = []
    div_name = name.split(' ')
    for x in range(len(div_name)):
        if x == len(div_name)-1:
            list_name.append('Surname: '+div_name[x])
        else:
            list_name.append('Name: '+div_name[x])
    return list_name
