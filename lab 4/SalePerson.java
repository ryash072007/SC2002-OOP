public class SalePerson implements Comparable<SalePerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SalePerson)) {
            return false;
        }

        SalePerson other = (SalePerson) o;
        return firstName.equals(other.firstName) && lastName.equals(other.lastName);
    }

    @Override
    public int compareTo(SalePerson o) {
        int salesCompare = Integer.compare(totalSales, o.totalSales);
        if (salesCompare != 0) {
            return salesCompare;
        }
        return o.lastName.compareTo(lastName);
    }
}
