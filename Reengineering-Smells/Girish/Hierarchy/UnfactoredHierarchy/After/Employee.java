import java.util.ArrayList;
import java.util.List;

interface Employee {
    String getName();
    List<Employee> getSubordinates();
    void addSubordinate(Employee employee);
}

class CEO implements Employee {
    private String name;
    private List<Employee> subordinates;

    public CEO(String name) {
        this.name = name;
        this.subordinates = new ArrayList<>();
    }

    @Override
    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Manager implements Employee {
    // Same as CEO class
}

class RegularEmployee implements Employee {
    // Same as CEO class but without subordinates logic
    private String name;

    public RegularEmployee(String name) {
        this.name = name;
    }

    @Override
    public void addSubordinate(Employee employee) {
        throw new UnsupportedOperationException("Regular employees cannot have subordinates.");
    }

    @Override
    public List<Employee> getSubordinates() {
        throw new UnsupportedOperationException("Regular employees do not have subordinates.");
    }

    @Override
    public String getName() {
        return name;
    }
}

public class FactoredHierarchyExample {
    public static void main(String[] args) {
        CEO ceo = new CEO("John (CEO)");
        
        Manager manager1 = new Manager("Mike (Manager 1)");
        Manager manager2 = new Manager("Lisa (Manager 2)");
        
        RegularEmployee employee1 = new RegularEmployee("Alice (Employee 1)");
        RegularEmployee employee2 = new RegularEmployee("Bob (Employee 2)");
        RegularEmployee employee3 = new RegularEmployee("Eve (Employee 3)");
        
        ceo.addSubordinate(manager1);
        ceo.addSubordinate(manager2);
        
        manager1.addSubordinate(employee1);
        manager1.addSubordinate(employee2);
        
        manager2.addSubordinate(employee3);
        
        // Traversing the hierarchy
        traverseHierarchy(ceo, 0);
    }
    
    public static void traverseHierarchy(Employee employee, int level) {
        // Same as before
    }
}