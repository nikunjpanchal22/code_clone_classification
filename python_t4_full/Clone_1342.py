def curry(func) :
  def call_with(arg1) :
    def call_with_2(arg2) :
      return func(arg1, arg2)


 def curry(func):
  def call_with(*args):
    if len(args) == 1:
      arg1 = args[0]
      def call_with_2(*arg2s):
        return func(arg1, *arg2s)
      return call_with_2
    else:
      return func(*args)

  return call_with


