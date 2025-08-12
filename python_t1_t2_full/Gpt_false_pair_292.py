def sum_numbers(s) :
  sum= 0 
  for n in s.split():  
    sum +=float(n) 
  return sum


 def sum_numbers(s):
  res = 0
  for n in s.split():
    res = float(n) + res
  return res
