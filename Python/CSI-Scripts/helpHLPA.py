import os

def is_digit(g):
    try:
        float(g)
    except valueError:
        return False
    return True

os.system("helpme assistant list-open")
number = input("Who would you like to help? ")

if (is_digit(g=number)):
    os.system("helpme assistant in-progress " + str(number))
else:
    print("\nOk, cool!\n")
