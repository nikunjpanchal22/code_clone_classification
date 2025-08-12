def __init__(cls, * a, ** k) :
	mkl = cls.__class__
	class spec(mkl) : pass
	for n, v in vars(cls).items() :
		if isinstance(v, const) :
			setattr(spec, n, v)
	spec.__name__ = mkl.__name__
	cls.__class__ = spec


            setattr(wrapper, name, value)
    wrapper.__name__ = cls_obj.__name__
    self.__class__ = wrapper




def __init__(cls, *args, **kwargs):
    super_cls = cls.__class__
    class subclass(super_cls): pass


