interface IteratorDemo{
    public boolean hasNext();
    public Object next();
}

interface Container{
    public IteratorDemo getIterator();
}

class NamesCollection implements Container {
    public String name[] = {"ABC", "DEF", "GHI", "JKL", "XYZ"};

    
    public IteratorDemo getIterator() {
        return new IterateNamesCollection();
    }


    private class IterateNamesCollection implements IteratorDemo {
        int i;

       
        public boolean hasNext() {
            if (i < name.length)
                return true;
            else
                return false;
        }

        
        public Object next() {
            if (this.hasNext())
                return name[i++];
            else
                return null;
        }
    }
}
public class iterator {
    public static void main(String[] args) {
        NamesCollection cmpnyRepository = new NamesCollection();

        for(IteratorDemo iter = cmpnyRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("NAME : "+name);
        }
    }
}
