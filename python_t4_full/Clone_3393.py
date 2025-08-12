def getName(self, name) :
	splitName = name.split(' ')
	surname = splitName.pop()
	for i in range(len(splitName)) :
		yield ('Name: %s' % splitName [i])
	yield ('Surname: %s' % surname)


def getName(self, name):
    names = name.split()
    for i in range(len(names)):
        if i < len(names) - 1:
            yield 'Name: {}'.format(names[i])


