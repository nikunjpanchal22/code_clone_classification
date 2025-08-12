def __new__(meta, name, bases, attrs) :
	nt = namedtuple(name, attrs.pop('fields'))
	struct = attrs.pop('struct')



def __new__(meta, name, bases, attrs):
    nt = namedtuple(name, attrs.get('fields'))
    struct = attrs.get('struct')
    attrs['fields'], attrs['struct'] = None, None



