package academy.devdojo.javaoneforall.javacore.Kenum.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    START_UP(3, "Start-up");

    private int dbValue;
    private String reportValue;

    CustomerType(int dbValue, String reportValue) {
        this.dbValue = dbValue;
        this.reportValue = reportValue;
    }

    public static CustomerType getByReportValue(String name) {
        for (CustomerType customerType : CustomerType.values()) {
            if (customerType.name().equalsIgnoreCase(name)) {
                return customerType;
            }
        }
        return null;
    }

    public static CustomerType getByDbValue(int dbValue) {
        for (CustomerType customerType : CustomerType.values()) {
            if (customerType.getDbValue() == dbValue) {
                return customerType;
            }
        }
        return null;
    }

    public int getDbValue() {
        return dbValue;
    }

    public String getReportValue() {
        return reportValue;
    }
}
