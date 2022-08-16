def is_jojo(name):
    name = name.lower().split(" ") #We transform our string to lower case and split all words
    if name[0].startswith("jo") and name[len(name)-1].endswith("jo") \
            or name[0].startswith("jo") and name[len(name)-1].startswith("jo") \
            or name[0].startswith("gio") and name[len(name)-1].startswith("gio"): #I use len(name)-1 to identificate last word
        return True
    else:
        return False
    pass #...your code here - do not delete either one even if not used

print(is_jojo("Dio Brando"))
print(is_jojo("Jonathan Joestar"))