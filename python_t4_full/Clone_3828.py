def __new__(meta, name, bases, attrs) :
	nt = namedtuple(name, attrs.pop('fields'))
	struct = attrs.pop('struct')



def __new__(meta, name, bases, attrs):
    fields = attrs['fields']
    attrs.pop('fields')
    struct = attrs['struct']
    attrs.pop('struct')
    nt = namedtuple(name, fields)



