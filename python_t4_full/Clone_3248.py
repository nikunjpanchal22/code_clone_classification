def __init__(self, a = None, b = None, e = None, f = None) :
	if [a, b, e, f].count(None) > 2 :
		raise Exception('Not enough parameters to make an ellipse')
	self.a, self.b, self.e, self.f = a, b, e, f
	self.calculate_a()
	for parameter in 'b', 'e', 'f' :
		if self.__dict__ [parameter] is None :
			Ellipse.__dict__ ['calculate_' + parameter](self)


    for attribute in 'j', 'k', 'l':
        if getattr(self, attribute) is None:
            getattr(self, 'compute_' + attribute)()

 

def __init__(self, m=None, n=None, o=None, p=None):
    if [m, n, o, p].count(None) > 2:
        raise Exception('Parameters inadequate for ellipse')


