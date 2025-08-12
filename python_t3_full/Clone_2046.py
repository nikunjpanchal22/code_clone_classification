def __init__(cls, * a, ** k) :
	mkl = cls.__class__
	class spec(mkl) : pass
	for n, v in vars(cls).items() :
		if isinstance(v, const) :
			setattr(spec, n, v)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec






def __init__(self, *a, **kwargs):
    new_cls = self.__class__
    class inherit_class(new_cls): pass
    for name, val in vars(self).items():
        if isinstance(val, const):
            setattr(inherit_class, name, val)


