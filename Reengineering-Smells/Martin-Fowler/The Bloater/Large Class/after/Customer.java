public class Customer {
    private String name;
    private int age;
    private Credit credit = new Credit();

	public Customer(String n, int a, int c) {
        name = n;
        age = a;
        credit.setCredit(c);
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setCredit(int c) {
        credit.setCredit(c);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCredit() {
        return credit.getCredit();
    }

    public boolean hasCredit() {
        if (credit.getCredit() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
