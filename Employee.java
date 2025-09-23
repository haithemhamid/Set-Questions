import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

class Employee {
    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId + ", Name: " + name;
    }

    // TO-DO: Implement equals()
    // An employee is equal to another if their employeeId is the same.
    @Override
    public boolean equals(Object o) {
        // Your code here
        if(this==o) return true;
        if(o==null) return false;
        Employee other=(Employee) o;
        return this.employeeId == other.getEmployeeId();// Placeholder
    }
    // TO-DO: Implement hashCode()
    // It must be consistent with the equals() method.
    @Override
    public int hashCode() {
        // Your code here

        return Integer.hashCode(employeeId); // Placeholder
    }
}

class HRSystem {
    /**
     * TO-DO: Return a Set containing unique employees from the input list.
     * This will only work correctly if Employee.equals() and Employee.hashCode() are implemented properly.
     * @param allEmployees A list that may contain duplicate employee records.
     * @return A Set of unique Employee objects.
     */
    public Set<Employee> deduplicateEmployees(List<Employee> allEmployees) {
        // Your code here. This should be a one-line implementation.

        return new HashSet<Employee>(allEmployees) ;
    }


}
class AnalyticsDashboard {
    /**
     * TO-DO: Find all users that are in the 'allUsers' list but NOT in the 'activeUsers' list.
     * Use HashSets for an efficient implementation.
     \*
     * @param allUsers A list of all registered Employee objects.
     * @param activeUsers A list of recently active Employee objects.
     * @return A Set of inactive Employee objects.
     */
    public Set<Employee> findInactiveUsers(List<Employee> allUsers, List<Employee> activeUsers) {
        // Your code here:
        // 1. Convert both lists to HashSets.
        // 2. Perform the set difference operation.
        // 3. Return the resulting set.
        Set<Employee> allUsersSet= new HashSet<>(allUsers);
        Set<Employee> activeUsersSet= new HashSet<>(activeUsers);
        allUsersSet.removeAll(activeUsersSet);
        return allUsersSet; // Placeholder
    }
}

