def __init__(cls, * a, ** k) :
	mkl = cls.__class__
	class spec(mkl) : pass
	for n, v in vars(cls).items() :
		if isinstance(v, const) :
			setattr(spec, n, v)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec





def __init__(cls_instance, *a, **k):
    cls = cls_instance.__class__
    class NewClass(cls): pass
    for attr, value in cls_instance.__dict__.items():
        if isinstance(value, const):
            setattr(NewClass, attr, value)
    NewClass.__name__ = cls.__name__


