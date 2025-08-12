def __init__(self, a = None, b = None, e = None, f = None) :
	if [a, b, e, f].count(None) > 2 :
		raise Exception('Not enough parameters to make an ellipse')
	self.a, self.b, self.e, self.f = a, b, e, f
	self.calculate_a()
	for parameter in 'b', 'e', 'f' :
		if self.__dict__ [parameter] is None :
			Ellipse.__dict__ ['calculate_' + parameter](self)


                getattr(Ellipse, f'calculate_{param}')(ellipse)




def __init__(self,a=None, b=None, e=None, f=None):
    params = {'a': a, 'b': b, 'e': e, 'f': f}
    if len([k for k,v in params.items() if v is None]) > 2:
        raise Exception('Not enough parameters to make an ellipse')
    for k in params:
        setattr(self, k, params[k])
    if callable(getattr(self, 'calculate_a', None)):
        self.calculate_a()
    for k in params:
        if k != 'a' and getattr(self, k) is None and callable(getattr(self, f'calculate_{k}', None)):
            getattr(self, f'calculate_{k}')()




class Ellipse:
    def __init__(ellipse, a=None, b=None, e=None, f=None):
        param_dict = {'a': a, 'b': b, 'e': e, 'f': f}
        intersect = lambda x, y: bool(set(x) & set(y))
        if intersect(param_dict.values(), [None]) > 2:
            raise Exception('Not enough parameters to make an ellipse')
        for key in param_dict:
            setattr(ellipse, key, param_dict[key])
        ellipse.calculate_a()
        for parameter in param_dict:
            if getattr(ellipse, parameter) is None:
                getattr(Ellipse, f'calculate_{parameter}')(ellipse)




class Ellipse:
    def __init__(ellipse, a=None, b=None, e=None, f=None):
        methods = [a, b, e, f]
        if any([
            len([x for x in methods if x is None]) > 2,
            not hasattr(ellipse, 'calculate_a') or
            any([getattr(ellipse, parameter) is None and not hasattr(ellipse, f'calculate_{parameter}') 
                 for parameter in methods])]):
            raise Exception('Not enough parameters to make an ellipse')


