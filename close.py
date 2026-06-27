import pyautogui
import time

print ("Starting in 3 seconds")
time.sleep(3)

for i in range(5): 
    pyautogui.hotkey('alt', 'f4')
    time.sleep(1)

    print("Done !")