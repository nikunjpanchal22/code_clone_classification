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
    new_spec = type(cls_class.__name__, (cls_class,), dict())
    for field_name, field_value in vars(cls).items():
        if isinstance(field_value, const):
            setattr(new_spec, field_name, field_value)
    cls.__class__ = new_spec


