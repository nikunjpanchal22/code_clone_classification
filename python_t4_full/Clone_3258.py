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


    self.i = None
    self.O = None
    self.P = None
    if kwargs :
        for key in kwargs :
            setattr(self, key, kwargs [key])


 

def __init__(self, c = None, d = None, ** kwargs) :
    self.relations = {
    "f" : {"req" : ["c", "d"], "func" : lambda c, d : c**2 + d**2},
    "G" : {"req" : ["f", "c"], "func" : lambda f, c : f // c},
    "H" : {"req" : ["G", "f"], "func" : lambda f, G : complex_func_H(f, G)},
    "c" : {"req" : ["f", "d"], "func" : lambda f, d : f - d},
    "d" : {"req" : ["f", "c"], "func" : lambda f, c : f - c}}


