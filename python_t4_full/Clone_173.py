def compose(f, n) :
  def g(x):
    return f(n(x))
  return g


 def compose(f, n):
    def g(*args, **kwargs):
        return f(n(*args, **kwargs))
    return g


