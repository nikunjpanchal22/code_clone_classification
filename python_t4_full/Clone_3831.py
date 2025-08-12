def __new__(meta, name, bases, attrs) :
	nt = namedtuple(name, attrs.pop('fields'))
	struct = attrs.pop('struct')



def __new__(meta, name, bases, attrs):
    nt = namedtuple(name, attrs['fields'])
    struct = attrs['struct']
    del attrs['fields'], attrs['struct']



