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


    if kwargs :
        for key in kwargs :
            setattr(self, key, kwargs [key])


 

def __init__(self, t = None, s = None, ** kwargs) :
    self.relations = {
    "u" : {"req" : ["t", "s"], "func" : lambda t, s : t ** s},
    "V" : {"req" : ["u", "t"], "func" : lambda u, t : u / t},
    "X" : {"req" : ["V", "u"], "func" : lambda u, V : power_func_X(u, V)},
    "t" : {"req" : ["u", "s"], "func" : lambda u, s : u * s},
    "s" : {"req" : ["u", "t"], "func" : lambda u, t : u * t}}
    self.t = t
    self.s = s
    self.u = None


