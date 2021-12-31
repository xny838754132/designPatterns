package cn.thenai.factory.simplefactory.pizza;

//将pizza类做成抽象
public abstract class Pizza {
    protected String name;

    /**
     * 准备原材料不同的披萨不一样，因此做成抽象
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println(name + " baking");
    }

    /**
     * 切割
     */
    public void cut() {
        System.out.println(name + " cutting");
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println(name + " boxing");
    }

    /**
     * 设置披萨名字
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}