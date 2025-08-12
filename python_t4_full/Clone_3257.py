def __init__(self, a = None, b = None, ** kwargs) :
	self.relations = {
	"e" : {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"C" : {"req" : ["e", "a"], "func" : lambda e, a : e * 1 / (a * b)},
	"A" : {"req" : ["C", "e"], "func" : lambda e, C : cmplx_func_A(e, C)},
	"a" : {"req" : ["e", "b"], "func" : lambda e, b : e / b},
	"b" : {"req" : ["e", "a"], "func" : lambda e, a : e / a}}
	self.a = a
	self.b = b
	self.e = None
	self.C = None
	self.A = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])


    self.T = None
    self.B = None
    if kwargs :
        for key in kwargs :
            setattr(self, key, kwargs [key])


 

def __init__(self, g = None, h = None, ** kwargs) :
    self.relations = {
    "i" : {"req" : ["g", "h"], "func" : lambda g, h : g * h},
    "O" : {"req" : ["i", "g"], "func" : lambda i, g : i - g},
    "P" : {"req" : ["O", "i"], "func" : lambda i, O : find_func_P(i, O)},
    "g" : {"req" : ["i", "h"], "func" : lambda i, h : i / h},
    "h" : {"req" : ["i", "g"], "func" : lambda i, g : i / g}}
    self.g = g


