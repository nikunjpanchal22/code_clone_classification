def compose(f, n) :
  def g(x):
    return f(n(x))
  return g


 def compose(f, n):
     def g(x):
        a = n(x)
        return f(a)
     return g


