import os

os.system("helpme assistant list-open")
number = raw_input("Who did you help? ")
reason = ""
reason = raw_input("What did you help them with? ")
os.system("helpme assistant fulfill " + str(number) + " " + str(reason))
