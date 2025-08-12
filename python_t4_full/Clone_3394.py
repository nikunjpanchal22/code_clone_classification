def getName(self, name) :
	splitName = name.split(' ')
	surname = splitName.pop()
	for i in range(len(splitName)) :
		yield ('Name: %s' % splitName [i])
	yield ('Surname: %s' % surname)


def getName(self, name):
    names = iter(name.split())
    for name in names:
        yield 'Name: {}'.format(next(names, ''))
    yield 'Surname: {}'.format(name)





