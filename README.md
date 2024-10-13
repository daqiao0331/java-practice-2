# Java第二次作业，

## 程序介绍
这个程序模拟了 PC 电脑的组成部分，包括 `CPU`、`HardDisk`（硬盘）和 `PC` 三个类。项目通过类之间的关联展示了如何设置和获取 CPU 的速度以及硬盘的容量，并最终在控制台打印出这些信息。

## 类
- **`CPU`**: 
  - **描述**: 此类代表计算机的中央处理单元（CPU），用于处理计算机的指令。
  - **属性**:
    - `speed` (int): 表示 CPU 的速度，以 MHz 为单位。
  - **方法**:
    - `getSpeed()`: 返回当前 CPU 的速度。
    - `setSpeed(int m)`: 设置 CPU 的速度为给定值 `m`。

- **`HardDisk`**:
  - **描述**: 此类代表计算机的硬盘，负责存储数据和文件。
  - **属性**:
    - `amount` (int): 表示硬盘的容量，以 GB 为单位。
  - **方法**:
    - `getAmount()`: 返回当前硬盘的容量。
    - `setAmount(int amount)`: 设置硬盘的容量为给定值 `amount`。

- **`PC`**:
  - **描述**: 此类代表个人计算机，能够组合 CPU 和硬盘，并展示它们的规格。
  - **属性**:
    - `cpu` (CPU): 代表当前 PC 使用的 CPU 对象。
    - `HD` (HardDisk): 代表当前 PC 使用的硬盘对象。
  - **方法**:
    - `setCPU(CPU cpu)`: 设置当前 PC 使用的 CPU。
    - `setHardDisk(HardDisk HD)`: 设置当前 PC 使用的硬盘。
    - `show()`: 打印当前 PC 的 CPU 速度和硬盘容量。

- **`Test`**:
  - **描述**: 此类包含程序的入口点，负责创建和测试其他类的功能。
  - **方法**:
    - `main(String[] args)`: 程序的主方法，执行以下操作：
      1. 创建一个 `CPU` 对象，并设置其速度为 2200 MHz。
      2. 创建一个 `HardDisk` 对象，并设置其容量为 200 GB。
      3. 创建一个 `PC` 对象，并将上述的 CPU 和硬盘对象设置到该 PC 中。
      4. 调用 `show()` 方法，展示 PC 的 CPU 速度和硬盘容量。



## 示例输出
CPU speed: 2200 MHz HardDisk amount: 200 GB

## 注意事项
请确保所有类都在同一个文件夹内，文件名为 `Test.java`。并使用javac指令去编译，使用java Test去运行。
