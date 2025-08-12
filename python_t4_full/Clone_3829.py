def __new__(meta, name, bases, attrs) :
	nt = namedtuple(name, attrs.pop('fields'))
	struct = attrs.pop('struct')



def __new__(meta, name, bases, attrs):
    if attrs:
        nt = namedtuple(name, attrs.pop('fields'))
        struct = attrs.pop('struct', None)
    else:
        nt = namedtuple(name, [])


