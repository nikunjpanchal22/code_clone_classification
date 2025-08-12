def compose(f, n) :
  def g(x):
    return f(n(x))
  return g


 def compose(f, n):
     def g(*args):
        y = n(*args)
        return f(y)
     return g


