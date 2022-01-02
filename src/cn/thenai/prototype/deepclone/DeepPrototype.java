package cn.thenai.prototype.deepclone;

import java.io.*;

public class DeepPrototype implements Serializable, Cloneable {

    public String name;

    public DeepCloneableTarget deepCloneableTarget; // 引用类型

    public DeepPrototype(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public DeepPrototype() {
    }

    /**
     * 深拷贝实现
     */
    @Override
    protected DeepPrototype clone() {
        // 完成对基本数据类型的clone
        try {
            DeepPrototype deep = (DeepPrototype) super.clone();
            deep.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
            return deep;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // 对引用类型的属性进行单独的处理
        return null;
    }

    /**
     * 深拷贝方式2 --序列化（推荐）
     */
    public DeepPrototype deepClone() {
        // 创建流对象
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            // 序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this); // 输出当前对象

            // 反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (DeepPrototype) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
               if (byteArrayOutputStream != null)
                byteArrayOutputStream.close();
                if (objectOutputStream != null)
                objectOutputStream.close();
                if (byteArrayInputStream != null)
                byteArrayInputStream.close();
                if (objectInputStream != null)
                objectInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}