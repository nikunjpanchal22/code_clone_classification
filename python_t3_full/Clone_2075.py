def __new__(meta, name, bases, attrs) :
	nt = namedtuple(name, attrs.pop('fields'))
	struct = attrs.pop('struct')



def __new__(meta, name, bases, attrs):
    attrs_id = id(attrs)
    nt = namedtuple(name, attrs.pop('fields'))
    struct = attrs.pop('struct')
    attrs_to_remove = [attrs_id, nt, struct]



