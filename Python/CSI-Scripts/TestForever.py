import os
x = 1
loopVal = input("How many tests would you like to run? ")
while(x <= loopVal):
    print(str(x) + " of " + str(loopVal))
    os.system("merlin test")
    x += 1
