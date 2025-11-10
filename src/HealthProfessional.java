// HealthProfessional.java
public class HealthProfessional {
    // 实例变量
    private int id;
    private String name;
    private String specialization; // 基础信息，适用于所有健康专业人员
    
    // 默认构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
    }
    
    // 带参数的构造函数
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }
    
    // 打印实例变量
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
    
    // Getter 方法
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
}