package cn.thenai.factory.abstractfactory.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("伦敦胡椒披萨");
        System.out.println("伦敦的胡椒披萨准备原材料~");
    }
}