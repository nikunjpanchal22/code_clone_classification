def getName(self, name) :
	splitName = name.split(' ')
	surname = splitName.pop()
	for i in range(len(splitName)) :
		yield ('Name: %s' % splitName [i])
	yield ('Surname: %s' % surname)




def getName(self, name) :
	parts = name.split(' ')
	surname = parts.pop()
	for i in range(len(parts)) :
		yield ('Name: %s' % parts[i])
	yield ('Surname: %s' % surname)
