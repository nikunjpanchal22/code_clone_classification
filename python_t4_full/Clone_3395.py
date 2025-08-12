def getName(self, name) :
	splitName = name.split(' ')
	surname = splitName.pop()
	for i in range(len(splitName)) :
		yield ('Name: %s' % splitName [i])
	yield ('Surname: %s' % surname)




def getName(self, name):
    split_name = name.split()
    last_name = split_name.pop()
    for name in split_name:
        yield f"Name: {name}"


