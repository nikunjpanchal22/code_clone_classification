def msg_decorator(f) :
  def inner():
    print("Before execution")
    f()
    print("After execution")
  return inner


 def msg_decorator(f) :
  def inner():
    print("Brace for the execution")
    f()
    print("Ended the execution")
  return inner
