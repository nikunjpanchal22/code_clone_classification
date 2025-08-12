def __init__(cls, * a, ** k) :
	mkl = cls.__class__
	class spec(mkl) : pass
	for n, v in vars(cls).items() :
		if isinstance(v, const) :
			setattr(spec, n, v)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec




def __init__(cls, * args, ** kwargs) :
	mkl = cls.__class__
	class spec(mkl) : pass
	class_vars = vars(cls)
	for name, value in class_vars.items() :
		if isinstance(value, const) :
			setattr(spec, name, value)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec

