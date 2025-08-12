def curry(func) :
  def call_with(arg1) :
    def call_with_2(arg2) :
      return func(arg1, arg2)


 def curry(func):
  def call_with(arg1):
    def call_with_2(arg2):
      argList = [arg1, arg2]
      return func(*argList)
    return call_with_2

  return call_with


