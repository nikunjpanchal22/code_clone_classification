def msg_decorator(f) :
  def inner():
    print("Before execution")
    f()
    print("After execution")
  return inner


 def msg_decorator(f) :
  def inner():
    print("Getting ready for the function")
    f()
    print("Terminated the execution")
  return inner
