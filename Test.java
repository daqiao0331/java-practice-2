class CPU {
    private int speed;
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int m) {
        this.speed = m;
    }
}

class HardDisk {
    private int amount;
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
class PC {
    private CPU cpu;
    private HardDisk HD;

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk HD) {
        this.HD = HD;
    }
    public void show() {
        System.out.println("CPU speed: " + cpu.getSpeed() + " MHz");
        System.out.println("HardDisk amount: " + HD.getAmount() + " GB");
    }
}
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200); 

        HardDisk disk = new HardDisk();
        disk.setAmount(200); 

        PC pc = new PC();

        pc.setCPU(cpu);

        pc.setHardDisk(disk);

        pc.show();
    }
}
