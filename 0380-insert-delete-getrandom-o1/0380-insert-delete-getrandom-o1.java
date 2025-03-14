class RandomizedSet {
    private List<Integer> l;
    private Random rand;

    public RandomizedSet() {
        l = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(l.contains(val)) {
            return false;
        }
        l.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(l.contains(val)) {
            l.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return l.get(rand.nextInt(l.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */