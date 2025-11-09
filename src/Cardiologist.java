// Cardiologist.java
public class Cardiologist extends HealthProfessional {
    private boolean performsSurgery; // 心脏科医生特有属性
    
    // 默认构造函数
    public Cardiologist() {
        super();
        this.performsSurgery = false;
    }
    
    // 带参数的构造函数
    public Cardiologist(int id, String name, String specialization, boolean performsSurgery) {
        super(id, name, specialization);
        this.performsSurgery = performsSurgery;
    }
    
    // 重写打印方法
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: Cardiologist");
        super.printDetails();
        System.out.println("Performs Surgery: " + (performsSurgery ? "Yes" : "No"));
        System.out.println("------------------------");
    }
    
    // Getter
    public boolean performsSurgery() { return performsSurgery; }
}