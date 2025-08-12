def __new__(meta, name, bases, attrs) :
	nt = namedtuple(name, attrs.pop('fields'))
	struct = attrs.pop('struct')



def __new__(meta, name, bases, attrs):
    nt = namedtuple(attrs.pop('name'), attrs.pop('fields'))
    struct = attrs.pop('struct')
    attrs.update({'nt': nt, 'struct': struct})



