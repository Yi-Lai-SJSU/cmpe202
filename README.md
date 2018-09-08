# cmpe202
I thougt three methods to do the Lab:
1. use abstract class, which means: different gumball machine is a different class extends the basic gumball machine interface
2. use the strategy pattern, in the one gumball machien class to realize all the three handling of different gumball machine type.
3. But finally, I found the easiest way to realize the supporting of three different machines is to define a gumball machine type attritute in the guamball machine class. I define a nested calss GMtype to record the valid coins and the threshold to eject gumball. All the other methods are the same not need to be modified. 
