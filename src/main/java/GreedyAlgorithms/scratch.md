<h1>Notes on my implementation of the Greedy Algorithm python code in Java</h1>
there have been so many false positives as regards finding out what exactly is wrong with my code. 
i think i might stumbled upon something else that might be the cause and it is the highlighted part of this bit of python code. 
i don't know sha. maybe this is also another false positive. in my own java code translation, i put this bit of the code outside the while loop.
<br>


initially as i was writing this comment, i was wondering what the hell was happening. i suspected that the while loop had no role to play at all with regards to the highlighted sets. but that is not true. 
when the while loop returns, the best station set and the states covered set as well need to be null but with the way i arranged mine before, it turned out to be the case that upon a while loop return, the best station and states covered sets are assigned a thing. so bringing these things inside of the while loop in my code should solve the problem. it should. 
<br>

and it did work. careful paying of attention to detail motherfucker.
And just like was predicted, the states Raypower had covered had already being covered by another radio station.
<br>

All of this fucking debugging just to find out that it was simple "mislocation" of variables that fucked shit up.