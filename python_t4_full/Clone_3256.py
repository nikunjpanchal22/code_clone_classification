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


    self.X = None
    if kwargs :
        for key in kwargs :
            setattr(self, key, kwargs [key])


 

def __init__(self, j = None, k = None, ** kwargs) :
    self.relations = {
    "l" : {"req" : ["j", "k"], "func" : lambda j, k : j + k**2},
    "T" : {"req" : ["l", "j"], "func" : lambda l, j : l * j},
    "B" : {"req" : ["T", "l"], "func" : lambda l, T : calculate_func_B(l, T)},
    "j" : {"req" : ["l", "k"], "func" : lambda l, k : l // k},
    "k" : {"req" : ["l", "j"], "func" : lambda l, j : l // j}}
    self.j = j
    self.k = k


