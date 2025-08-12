def __init__(self, a = None, b = None, e = None, f = None) :
	if [a, b, e, f].count(None) > 2 :
		raise Exception('Not enough parameters to make an ellipse')
	self.a, self.b, self.e, self.f = a, b, e, f
	self.calculate_a()
	for parameter in 'b', 'e', 'f' :
		if self.__dict__ [parameter] is None :
			Ellipse.__dict__ ['calculate_' + parameter](self)


    self.calculate_a()
    for parameter, value in zip(['b', 'e', 'f'], values[1:]):
        if value is None :
            getattr(self, 'calculate_' + parameter)()


 


def __init__(self, **kwargs):
    if len([value for value in kwargs.values() if value is None]) > 2:
        raise Exception('Not enough parameters')


