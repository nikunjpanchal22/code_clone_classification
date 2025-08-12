def __init__(self, a = None, b = None, e = None, f = None) :
	if [a, b, e, f].count(None) > 2 :
		raise Exception('Not enough parameters to make an ellipse')
	self.a, self.b, self.e, self.f = a, b, e, f
	self.calculate_a()
	for parameter in 'b', 'e', 'f' :
		if self.__dict__ [parameter] is None :
			Ellipse.__dict__ ['calculate_' + parameter](self)


        if self.__dict__[parameter] is None:
            getattr(self, 'find_' + parameter)()

 

def __init__(self, i=None, j=None, k=None, l=None):
    if [i, j, k, l].count(None) > 2:
        raise ValueError('Not sufficient parameters to model an ellipse')
    self.i, self.j, self.k, self.l = i, j, k, l


