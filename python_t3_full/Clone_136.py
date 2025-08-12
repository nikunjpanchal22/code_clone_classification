def compose(f, n) :
  def g(x):
    return f(n(x))
  return g


 def compose(f, n):
     def g(x):
        return f(n(f(x)))
     return g


