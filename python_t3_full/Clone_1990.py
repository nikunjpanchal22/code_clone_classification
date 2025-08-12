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


            setattr(self, key, kwargs [key])


 

def __init__(self, u = None, v = None, ** kwargs) :
    self.relations = {
    "w" : {"req" : ["u", "v"], "func" : lambda u, v : u * v**2},
    "R" : {"req" : ["w", "u"], "func" : lambda w, u : w ^ u},
    "K" : {"req" : ["R", "w"], "func" : lambda w, R : calculate_func_K(w, R)},
    "u" : {"req" : ["w", "v"], "func" : lambda w, v : w * v},
    "v" : {"req" : ["w", "u"], "func" : lambda w, u : w * u}}
    self.u = u
    self.v = v
    self.w = None
    self.R = None
    self.K = None


