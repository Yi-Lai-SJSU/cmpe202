#Part one : Compare the Lab1 and Lab10
In lab 1: "GumballMachine" class included a "nested" class "GMType"to record the coins set and cost for gumball machine.

    ```Java
    class GMType {
        private int[] accepted_Coins;
        private int thresholdOfCoins;

        GMType(int[] accepted_Cions, int thresholdOfCoins) {
            this.accepted_Coins = accepted_Cions;
            this.thresholdOfCoins = thresholdOfCoins;
        }

        boolean isCoinAccepted(int valueOfCoin) {
            ...
        } // return true if the coin in the valid coin set;

        boolean isMoneyEnough() {
            ...
        } // return true if the money is enough
        
        int getThresholdOfCoins() {
            ...
        }
    }
    ```
    
In the constructor of the GumballMachine class, according to the different user's input, the cost and the accepted coins can be be decided. There are three different types.
```Java
    switch (machineType) {
            case 0:
                gmType = new GMType(new int[]{25}, 25); // quarter machine
                break;
            case 1:
                gmType = new GMType(new int[]{25}, 50); //two quarter machine
                break;
            case 2:
                gmType = new GMType(new int[]{5, 10, 25}, 50); //slot machine
                break;
            case 3:
                gmType = new GMType(new int[]{1,5,10,25,100}, 100); break;                       
            default:
                gmType = new GMType(new int[]{}, 0);  // can add any types here
                break;
    }
    ```
    In the lab10, the type of the gumball machine is decided by the configuration before the main start to run. The whole procedure is intervened by the .aj file. 
    
    
#Part Two : Model.xml:
![image](https://github.com/Yi-Lai-SJSU/cmpe202/blob/master/lab10/screenshot%2Brun-result/model.png)

#Part Three : configuaration and output:
1. Config 1 - crankmodel accept quarter only and the cost is 25 cents.

![](https://github.com/Yi-Lai-SJSU/cmpe202/blob/master/lab10/screenshot%2Brun-result/config%201%20-%20crank%20one%20quarter%20-%20cost%2025.png)

![](https://github.com/Yi-Lai-SJSU/cmpe202/blob/master/lab10/screenshot%2Brun-result/config%201%20-%20crank%20one%20quarter%20-%20cost%2025%20-%20result.png)

2. Config 2 - crankmodel accept two quarter and the cost is 50 cents.

![](https://github.com/Yi-Lai-SJSU/cmpe202/blob/master/lab10/screenshot%2Brun-result/config%202%20-%20crank%20two%20quarter%20-%20cost%2050.png)

![](https://github.com/Yi-Lai-SJSU/cmpe202/blob/master/lab10/screenshot%2Brun-result/config%202%20-%20crank%20two%20quarter%20-%20cost%2050%20-%20result.png)

3. Config 3 - slotmodel accept any coins and the cost is 50 cents.

![](https://github.com/Yi-Lai-SJSU/cmpe202/blob/master/lab10/screenshot%2Brun-result/config%203%20-%20slot%20any%20coins%20-%20cost%2050.png)

![](https://github.com/Yi-Lai-SJSU/cmpe202/blob/master/lab10/screenshot%2Brun-result/config%203%20-%20slot%20any%20coins%20-%20cost%2050%20-%20result.png)


