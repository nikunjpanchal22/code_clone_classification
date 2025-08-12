def compose(f, n) :
  def g(x):
    return f(n(x))
  return g


 def compose(f, n):
    def g(*args):
        result = n(*args)
        return f(result)
    return g


