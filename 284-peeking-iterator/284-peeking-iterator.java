// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    ArrayList<Integer> ls;
    int count=0;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        ls=new ArrayList<>();
         while(iterator.hasNext()){
            ls.add(iterator.next());
        }
        this.count = 0;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return ls.get(count);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return ls.get(count++);
	}
	
	@Override
	public boolean hasNext() {
	    return count<ls.size();
	}
}