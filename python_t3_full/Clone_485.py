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
    class_spec = type(cls_class.__name__, (cls_class,), dict())
    for key, value in vars(cls).items():
        if isinstance(value, const):
            setattr(class_spec, key, value)
    cls.__class__ = class_spec


