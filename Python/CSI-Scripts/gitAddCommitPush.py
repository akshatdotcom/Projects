# adds changes, stages commits, and pushes commits to git master from working directory
# alias is gacp

import os
os.system("git add *")
os.system("git commit")
os.system("git push")
