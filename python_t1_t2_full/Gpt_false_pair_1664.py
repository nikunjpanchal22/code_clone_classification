def msg_decorator(f) :
  def inner():
    print("Before execution")
    f()
    print("After execution")
  return inner


 def msg_decorator(f) :
  def inner():
    print("Time to execute the function")
    f()
    print("Done with the run")
  return inner
