// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    private boolean canPrescribeMedication; // GP 特有属性
    
    // 默认构造函数
    public GeneralPractitioner() {
        super();
        this.canPrescribeMedication = true;
    }
    
    // 带参数的构造函数
    public GeneralPractitioner(int id, String name, String specialization, boolean canPrescribeMedication) {
        super(id, name, specialization);
        this.canPrescribeMedication = canPrescribeMedication;
    }
    
    // 重写打印方法
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printDetails();
        System.out.println("Can Prescribe Medication: " + (canPrescribeMedication ? "Yes" : "No"));
        System.out.println("------------------------");
    }
    
    // Getter
    public boolean canPrescribeMedication() { return canPrescribeMedication; }
}