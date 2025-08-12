def __init__(self, a = None, b = None, e = None, f = None) :
	if [a, b, e, f].count(None) > 2 :
		raise Exception('Not enough parameters to make an ellipse')
	self.a, self.b, self.e, self.f = a, b, e, f
	self.calculate_a()
	for parameter in 'b', 'e', 'f' :
		if self.__dict__ [parameter] is None :
			Ellipse.__dict__ ['calculate_' + parameter](self)


def __init__(self, c1=None, c2=None, c3=None, c4=None): 
    if [c1, c2, c3, c4].count(None) > 2:
        raise Exception('Ellipse requires more parameters')
    self.c1, self.c2, self.c3, self.c4 = c1, c2, c3, c4
    self.calculate_c1()
    for variable in 'c2', 'c3', 'c4':
        if getattr(self, variable) is None:
            getattr(self, 'calculate_' + variable)()


