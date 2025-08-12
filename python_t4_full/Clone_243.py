def __init__(self, a = None, b = None, e = None, f = None) :
	if [a, b, e, f].count(None) > 2 :
		raise Exception('Not enough parameters to make an ellipse')
	self.a, self.b, self.e, self.f = a, b, e, f
	self.calculate_a()
	for parameter in 'b', 'e', 'f' :
		if self.__dict__ [parameter] is None :
			Ellipse.__dict__ ['calculate_' + parameter](self)


 def __init__(self, a = None, b = None, e = None, f = None) : 
    if [a, b, e, f].count(None) > 2 : 
        raise Exception('Not enough parameters to make an ellipse') 
    self.a, self.b, self.e, self.f = a, b, e, f 
    if a is None :
        self.calculate_a()
    elif b is None : 
        verifyA = self.calculate_b()
        if verifyA is not None : 
            self.a = verifyA 
    elif e is None : 
        verify_b = self.calculate_e()
        if verify_b is not None :
            self.b = verify_b 
    elif f is None : 
        verify_e = self.calculate_f()
        if verify_e is not None :
            self.e = verify_e


