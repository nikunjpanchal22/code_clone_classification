def __init__(cls, * a, ** k) :
	mkl = cls.__class__
	class spec(mkl) : pass
	for n, v in vars(cls).items() :
		if isinstance(v, const) :
			setattr(spec, n, v)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec


 def __init__(cls, *a, **k):
    cls_class = cls.__class__
    cls_special = type(cls_class.__name__, (cls_class,), dict())
    for name, val in vars(cls).items():
        if isinstance(val, const):
            setattr(cls_special, name, val)
    cls.__class__ = cls_special


