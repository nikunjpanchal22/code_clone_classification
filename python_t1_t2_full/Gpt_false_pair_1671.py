def msg_decorator(f) :
  def inner():
    print("Before execution")
    f()
    print("After execution")
  return inner


 def msg_decorator(f) :
  def inner():
    print("This function is about to run")
    f()
    print("The function has run successfully")
  return inner
