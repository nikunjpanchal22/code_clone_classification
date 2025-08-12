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
	final = [] 
	split_name = name.split(' ') 
	for i in range(len(split_name)): 
		if i == (len(split_name) - 1): 
			final.append('Surname: ' + split_name [i] ) 
		else : 
			final.append('Name: ' + split_name [i]) 
	return final
