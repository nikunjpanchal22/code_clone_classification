def __init__(cls, * a, ** k) :
	mkl = cls.__class__
	class spec(mkl) : pass
	for n, v in vars(cls).items() :
		if isinstance(v, const) :
			setattr(spec, n, v)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec




def init(object, * args, ** kwargs) :
	orig_cls = object.__class__
	class new_cls(orig_cls) : pass
	for name, value in vars(object).items() :
		if isinstance(value, const) :
			setattr(new_cls, name, value)
	new_cls.__name__ = orig_cls.__name__
	object.__class__ = new_cls
