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


            setattr(self, key, kwargs[key])




def __init__(self, a=None, b=None, **kwargs):
    self.relations = {
        "C": {"req": ["e", "b"], "func": lambda e, b: e + b},
        "A": {"req": ["a", "b"], "func": lambda a, b: a * b},
        "e": {"req": ["A", "C"], "func": lambda A, C: A / C},
        "a": {"req": ["A", "C"], "func": lambda A, C: A**C},
        "b": {"req": ["A", "C"], "func": lambda A, C: C / A}}
    self.a = a
    self.b = b
    self.e = None
    self.C = None
    self.A = None


