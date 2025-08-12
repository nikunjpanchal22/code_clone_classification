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

    self.a, self.b, self.e, self.f = a, b, e, f

    self.calculate_a()

    for param in [self.b, self.e, self.f]:
        if param is None:
            getattr(Ellipse, "calculate_" + param)(self)




