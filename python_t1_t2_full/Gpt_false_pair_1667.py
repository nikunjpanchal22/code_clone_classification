def msg_decorator(f) :
  def inner():
    print("Before execution")
    f()
    print("After execution")
  return inner


 def msg_decorator(f) :
  def inner():
    print("Let's execute the function")
    f()
    print("Done with the function")
  return inner
