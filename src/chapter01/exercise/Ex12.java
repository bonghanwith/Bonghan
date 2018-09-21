package chapter01.exercise;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean remove(Object o) {
        final Object[] es = elementData;
        final int size = this.size;
        int i = 0;
        found: {
            if (o == null) {
                for (; i < size; i++)
                    if (es[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (o.equals(es[i]))
                        break found;
            }
            return false;
        }
        fastRemove(es, i);
        return true;
    }
	
	public boolean remove(Object o) {
        final Object[] es = elementData;
        final int size = this.size;
        int i = 0;
        
        boolean isBreak = false;
        
        if (o == null) {
            for (; i < size; i++)
                if (es[i] == null) {
                	isBreak = true;
                	break;
                }
                    
        } else {
            for (; i < size; i++)
                if (o.equals(es[i])){
                	isBreak = true;
                	break;
                }
        }
        
        if(!isBreak) {
        	return false;
        }
        
        fastRemove(es, i);
        return true;
    }

}
