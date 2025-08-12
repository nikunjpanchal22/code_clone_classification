def __init__(cls, * a, ** k) :
	mkl = cls.__class__
	class spec(mkl) : pass
	for n, v in vars(cls).items() :
		if isinstance(v, const) :
			setattr(spec, n, v)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec




def init(cls, *args, ** kwargs) :
	mkl = cls.__class__
	class spec(mkl): pass
	cls_vars = vars(cls)
	for nm, val in cls_vars.items() :
		if isinstance(val, const) :
			setattr(spec, nm, val)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec
