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
    class_spec = type(mkl.__name__, (mkl,), dict())
    for property_name, property_value in vars(cls).items():
        if isinstance(property_value, const):
            setattr(class_spec, property_name, property_value)
    cls.__class__ = class_spec


