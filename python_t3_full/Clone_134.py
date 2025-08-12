def compose(f, n) :
  def g(x):
    return f(n(x))
  return g


 def compose(f, n):
     def g(x):
        x = n(x)
        return f(x)
     return g


