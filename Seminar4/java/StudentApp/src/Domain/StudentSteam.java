package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>  {
    private Integer idStream;

    public List<StudentGroup> getStream() {
        return stream;
    }

    public List<StudentGroup> stream;

    public StudentSteam(List<StudentGroup> stream, Integer idStream) {
        this.idStream = idStream;
        this.stream = stream;
    }

    @Override
    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("StudentSteam {");
//        stringBuilder.append("\n idStream = " + idStream );
//        stringBuilder.append("\n groupsNumber = " + stream.size());
//        stringBuilder.append("\n groups = [");
//
//        for (StudentGroup group : stream) {
//            stringBuilder.append("\n  groupId = " + group.getIdGroup());
//            stringBuilder.append("\n  students = " + group.getGroup());
//            stringBuilder.append("\n");
//        }
//
//        stringBuilder.append("\n ]");
//        stringBuilder.append("\n}");
//
//        return stringBuilder.toString();

        return "StudentSteam {" +
                "\n idStream = " + idStream +
                "\n groupsNumber = " + stream.size() +
                "\n stream = " + stream +
                "\n}";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(stream);
    }
}
