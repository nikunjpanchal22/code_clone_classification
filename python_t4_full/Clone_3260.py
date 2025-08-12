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


    self.A = None
    if kwargs:
        for key in kwargs:
            setattr(self, key, kwargs[key])




def __init__(self, a=None, b=None, **kwargs):
    self.relations = {
        "A": {"req": ["e", "C"], "func": lambda e, C: e**C},
        "C": {"req": ["A", "e"], "func": lambda A, e: A * e},
        "e": {"req": ["C", "A"], "func": lambda C, A: C / A},
        "a": {"req": ["e", "A"], "func": lambda e, A: e - A},
        "b": {"req": ["C", "a"], "func": lambda C, a: a + C}}
    self.a = a
    self.b = b


