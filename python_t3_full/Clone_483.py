def __init__(cls, * a, ** k) :
	mkl = cls.__class__
	class spec(mkl) : pass
	for n, v in vars(cls).items() :
		if isinstance(v, const) :
			setattr(spec, n, v)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec


 def __init__(cls, *a, **k):
    mkl = cls.__class__
    special = type(mkl.__name__, (mkl,), dict())
    for param_name, param_value in vars(cls).items():
        if isinstance(param_value, const):
            setattr(special, param_name, param_value)
    cls.__class__ = special


