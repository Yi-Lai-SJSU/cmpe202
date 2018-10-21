The main change is:
        
        in the Composite class:
        public void addChild (Component c) {
        if (components.size() == 0) { //the first added component. The base is null. 
            components.add(c);
        } else {
            ((PriceDecorator)c).setBase(components.get(components.size()-1));  // the base of the other leaf decorator is the last added one.
            components.add(c) ;
        }
    }
        


![](https://github.com/Yi-Lai-SJSU/cmpe202/blob/master/lab7/image/test-run.png)  
