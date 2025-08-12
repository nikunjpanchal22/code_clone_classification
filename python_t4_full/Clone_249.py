def __init__(self, a=None, b=None, e=None, f=None):
    if [a, b, e, f].count(None) > 2:
        raise Exception("Not enough parameters to make an ellipse")
    self.a, self.b, self.e, self.f = a, b, e, f
    self.calculate_a()
    for parameter in "b", "e", "f":
        if self.__dict__[parameter] is None:
            Ellipse.__dict__["calculate_" + parameter](self)


def __init__(self, a=None, b=None, e=None, f=None):
    if [a, b, e, f].count(None) > 2:
        raise Exception("Not enough parameters to make an ellipse")

    self.a = a
    self.b = b
    self.e = e
    self.f = f

    self.calculate_a()

    if self.b is None:
        Ellipse.calculate_b(self)
    if self.e is None:
        Ellipse.calculate_e(self)
    if self.f is None:
        Ellipse.calculate_f(self)




