public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        final int EMPLOYEES = 10;
        
        double[][] employeeData = generateEmployeeData(EMPLOYEES);
        
        double[][] newData = calculateBonusAndNewSalary(employeeData);
        
        displayResults(employeeData, newData);
    }
    
    public static double[][] generateEmployeeData(int numEmployees) {
        double[][] data = new double[numEmployees][2];
        
        System.out.println("Generated Employee Data:");
        System.out.println("Employee\tSalary\t\tYears of Service");
        
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            
            data[i][1] = (int)(Math.random() * 11);
            
            System.out.println((i+1) + "\t\t$" + data[i][0] + "\t" + data[i][1]);
        }
        
        return data;
    }
    
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] newData = new double[numEmployees][2];
        
        for (int i = 0; i < numEmployees; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            
            double bonusRate = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            
            double newSalary = salary + bonus;
            
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        
        return newData;
    }
    
    public static void displayResults(double[][] employeeData, double[][] newData) {
        int numEmployees = employeeData.length;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        System.out.println("\nEmployee Bonus Results:");
        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        
        for (int i = 0; i < numEmployees; i++) {
            double oldSalary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            
            System.out.println((i+1) + "\t\t$" + oldSalary + "\t" + years + "\t$" + bonus + "\t\t$" + newSalary);
            
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        
        System.out.println("\nSummary:");
        System.out.println("Total Old Salary: $" + totalOldSalary);
        System.out.println("Total New Salary: $" + totalNewSalary);
        System.out.println("Total Bonus: $" + totalBonus);
    }
}