package Domain;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> stream;

    public GroupIterator(List<StudentGroup> stream) {
        this.stream = stream;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < stream.size();
    }

    @Override
    public StudentGroup next() {
        if(!hasNext())
        {
            return null;
        }

        return stream.get(counter++);
    }
}
