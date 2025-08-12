def compose(f, n) :
  def g(x):
    return f(n(x))
  return g


 def compose(f, n):
    def g(*args):
        return f(n(*args))
    return g


