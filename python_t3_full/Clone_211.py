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
    for item in self.__dict__ :
        if self.__dict__[item] is None:
            function_name = 'calculate_' + item
            function_result = Ellipse.__dict__[function_name](self)
            self.__dict__[item] = function_result


