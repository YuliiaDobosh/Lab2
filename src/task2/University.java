package task2;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(final List<Group> groups) {
        this.groups = groups;
    }

    public University(final List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (final Group group : groups) {
            builder.append(group).append('\n');
        }
        return builder.toString();
    }
}
