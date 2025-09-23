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
