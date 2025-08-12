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


 

def __init__(self, a = None, b = None, ** kwargs) :
    self.relations = {
    "d" : {"req" : ["a", "b"], "func" : lambda a, b : a * b},
    "F" : {"req" : ["d", "a"], "func" : lambda d, a : d / (a + b)},
    "Q" : {"req" : ["F", "d"], "func" : lambda d, F : func_Q(d, F)},
    "a" : {"req" : ["d", "b"], "func" : lambda d, b : d - b},
    "b" : {"req" : ["d", "a"], "func" : lambda d, a : d - a}}
    self.a = a
    self.b = b
    self.d = None
    self.F = None
    self.Q = None
    if kwargs :
        for key in kwargs :
            setattr(self, key, kwargs [key])


