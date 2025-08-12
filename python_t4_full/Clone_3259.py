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


    if kwargs:
        for key in kwargs:
            setattr(self, key, kwargs[key])




def __init__(self, a=None, b=None, **kwargs):
    self.relations = {
        "C": {"req": ["b", "a"], "func": lambda b, a: b / a},
        "A": {"req": ["b", "C"], "func": lambda b, C: b * C},
        "a": {"req": ["b", "A"], "func": lambda b, A: A - b},
        "b": {"req": ["A", "a"], "func": lambda A, a: a + A},
        "e": {"req": ["a", "b"], "func": lambda a, b: a - b}}
    self.a = a
    self.b = b
    self.e = None


